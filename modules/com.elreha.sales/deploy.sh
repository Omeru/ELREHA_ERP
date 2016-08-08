#!/bin/bash
#*****************************************************************************************************************************************************
# *   Copyright (C) 2011-2014 by OpenZ, Inh.Stefan Zimmermann                              
# *   stefan@openz.de                                        
# *                                                                        
# *   This file is part of Runtime Environment                             
# *                     
# *   Deploys Webapp to the Cloud       
# *   RUN as ROOT          
#
#     -----COPYRIGHT NOTICE--------
#     Copyright (C) 2011-2014 by OPenZ, Inh. Stefan Zimmermann            
#     sz@openz.de                 
#     You may not redistribute this File. 
#     This is NOT Open-Source.      
#     This File is intellectual property of OpenZ, Inh. Stefan Zimmermann.
#     Copying, redistribution, modifying, installation of this file on Computer Systems is only legal with a written permission
#     of OpenZ , Stefan Zimmermann           
#     This file, in all formats existing, is a trade secret of and proprietary of OpenZ, its suppliers and / or licensors, 
#     including but not limited to, the specific internal code, design and structure of individual programs and software and associated interface information.  
#     You shall maintain Product confidence and prevent disclosure of the same by using a reasonable degree of care. 
#     You shall not disclose the confidential aspects of the Product, or part thereof, to anyone for any purpose.   
#     You acknowledge that all intellectual property rights in the Product, throughout the world, belong to OpenZ.  
#     You acknowledge that rights in this File are licensed (not sold) to you, and that you have no rights or title in, or to, this file other than the right to use it in accordance with the terms of this Agreement. 
#     OpenZ and its licensors retain ownership of all copies of this file and reserves all rights not expressly granted to you .   
#                                                                          
#########################################################################################################################################################
#
#
# Instance Specific Configurable Parameters
#
#
#
#Shell-PARAMETERS
#  
# Context - and Database NAME
APP=$1
#TARBALL File with the Distribution
TARBALL=$2
# Distribution or Module-Installation (fixed String DISTRI or Module-Java-Name )
DISTRI=$3
# New Instance Installation (Y or N)
ISNEW=$4
# 
#Passwords
DBMGRPWD=$5
DBUSRPWD=$6
TOMMGRPWD=$7
# Tomcat USER
TOMCATUSER=$8
#
# Path Environment - Directory Layout
# Tomcat
TOMPATH=$9
SEDTOMPATH=$(echo $TOMPATH | sed 's/\//\\\//g')
#
# Multimedia-Files
MEDIAPATH=${10}
SEDMEDIAPATH=$(echo $MEDIAPATH | sed 's/\//\\\//g')
#
# Logging Directory
LOGPATH=${11}
SEDLOGPATH=$(echo $LOGPATH | sed 's/\//\\\//g')
#
# Directory with unpacked Distribution
DISTRIBUTIONPATH=${12}
SEDDISTRIBUTIONPATH=$(echo $DISTRIBUTIONPATH | sed 's/\//\\\//g')
#
# Directory with Tarball
TARDISTRIBUTIONPATH=${13}
SEDTARDISTRIBUTIONPATH=$(echo $TARDISTRIBUTIONPATH | sed 's/\//\\\//g')
#
# Directory with Attachments
ATTPATH=${14}
SEDATTPATH=$(echo $ATTPATH | sed 's/\//\\\//g')
SEDATTPATH=$SEDATTPATH$APP
#
# Shell-PARAMETERS END
#
#
#
#echo $APP"1"$TARBALL"2"$DISTRI"3"$ISNEW"4"$DBMGRPWD"5"$DBUSRPWD"6"$TOMMGRPWD"7"$TOMCATUSER"8"$TOMPATH"9"$MEDIAPATH"10"$LOGPATH"11"$DISTRIBUTIONPATH"12"$TARDISTRIBUTIONPATH"13"$ATTPATH"14"
#
# Logging
if ! [ -d $LOGPATH ]; then
    echo "Logging-Directory does not exist -EXITING"
    exit 1
fi
TAG=`date +%Y-%m-%d-%s`
echo "Excecuting deploy for $APP and $TARBALL"
echo "Logging to "$LOGPATH$TAG"_deploy.log"
exec 3>&1
exec 2> >(tee -a $LOGPATH$TAG"_deploy.log" >&2)
exec 1>> $LOGPATH$TAG"_deploy.log"
echo "Excecuting deploy for $APP and $TARBALL"
#
#
#
# Try to create Directorys if not Existing
#
#
if ! [ -d $DISTRIBUTIONPATH ]; then
    echo "Distribution Path does not exists - Try to create it"
    mkdir $DISTRIBUTIONPATH
    chown $TOMCATUSER:$TOMCATUSER $DISTRIBUTIONPATH
    if ! [ -d $DISTRIBUTIONPATH ]; then
       echo "Cannot Create Distribution Path -EXITING"
       exec 1>&3
       echo "Cannot Create Distribution Path -EXITING"
       exit 1
    fi
fi
if ! [ -d $TARDISTRIBUTIONPATH ]; then
    echo "Tarball-Directory does not exist -EXITING"
    exec 1>&3
    echo "Tarball-Directory does not exist -EXITING"
    exit 1
fi
# Attachment - Path
if ! [ -d $ATTPATH ]; then
    echo "Attachment Path does not exists - Try to create it"
    mkdir $ATTPATH
    chown $TOMCATUSER:$TOMCATUSER $ATTPATH
    if ! [ -d $ATTPATH ]; then
       echo "Cannot Create Attachment Path -EXITING"
       exec 1>&3
       echo "Cannot Create Attachment Path -EXITING"
       exit 1
    fi
fi

if ! [ -d $MEDIAPATH ]; then  
    echo "Media Path does not exists - Try to create it"
    mkdir $MEDIAPATH
    chown $TOMCATUSER:$TOMCATUSER $MEDIAPATH
    if ! [ -d $MEDIAPATH ]; then
       echo "Cannot Create Media Path -EXITING"
       exec 1>&3
       echo "Cannot Create Media Path -EXITING"
       exit 1
    fi
fi


if ! [ -f $TARDISTRIBUTIONPATH/$TARBALL ]; then  
   echo "Distribution-Tarball $TARDISTRIBUTIONPATH/$TARBALL does not exist -EXITING"
   exec 1>&3
   echo "Distribution-Tarball $TARDISTRIBUTIONPATH/$TARBALL does not exist -EXITING"
   exit 1
fi
# Application specific Tomcat-Path
if ! [ -d $TOMPATH/$APP ]; then
   echo "Tomcat-Application-Directory for $APP does not exist Try to CREATE it.."
   mkdir $TOMPATH/$APP
   chown $TOMCATUSER:$TOMCATUSER $TOMPATH/$APP
   if ! [ -d $TOMPATH/$APP ]; then
      echo "Cannot Create Tomcat-Application-Directory -EXITING"
      exec 1>&3
      echo "Cannot Create Tomcat-Application-Directory -EXITING"
      exit 1
   fi
   
fi
# Application specific Attachment Path
if ! [ -d $ATTPATH/$APP ]; then
    echo "Attachment-Directory for $APP does not exist Try to CREATE it.."
    mkdir $ATTPATH/$APP
    chown $TOMCATUSER:$TOMCATUSER $ATTPATH/$APP
    if ! [ -d $ATTPATH/$APP ]; then
      echo "Cannot Create Attachment-Directory -EXITING"
      exec 1>&3
      echo "Cannot Create Attachment-Directory -EXITING"
      exit 1
   fi
   
fi

# Openbravo.properties Layout
SOURCEATTPATH="\/home\/openz\/attachments"
SOURCEMEDIAPATH="\/tmp"


if [ "$DISTRI" == "DISTRI" ]; then
      # DISTRIBUTION ROLLOUT
      # Cleaning sourcedir
      cd $DISTRIBUTIONPATH
      rm -rf *
      # Unpacking the tarball
      cp $TARDISTRIBUTIONPATH/$TARBALL .
      echo "Unpacking the tarball..."
      tar -xvf $TARBALL
      tar -xvf ./openz.tar > /dev/null
      echo "Tarball unpacked."
      mkdir zssql
      mv sql.tar zssql
      cd zssql
      tar -xvf ./sql.tar
      # Copy sqls to /tmp
      cp $DISTRIBUTIONPATH/zssql/* /tmp/
      cd $LOGPATH
      # Setting up Properties-File
      echo "Setting up Openbravo Properties for $APP ..."
      # Application Context
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'context.name=openz'/'context.name=$APP'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Attachment-Path
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'attach.path=$SOURCEATTPATH'/'attach.path=$SEDATTPATH'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Database SID
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'bbdd.sid=openz'/'bbdd.sid=$APP'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Database Passwords
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'bbdd.systemPassword=syspass'/'bbdd.systemPassword=$DBMGRPWD'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'bbdd.password=tad'/'bbdd.password=$DBUSRPWD'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Tomcat Manager Password
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'tomcat.manager.password=tad'/'tomcat.manager.password=$TOMMGRPWD'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Multimedia-Content Store Path
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'multimedia.path=$SOURCEMEDIAPATH'/'multimedia.path=$SEDMEDIAPATH'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Absolute path to the tomcat directory
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'tomcat.path=xxx'/'tomcat.path=$SEDTOMPATH$APP'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Absolute path to the deploy log directory
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'deploylogging.path=xxx'/'deploylogging.path=$SEDLOGPATH'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Absolute path to the distribution directory
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'distribution.path=xxx'/'distribution.path=$SEDDISTRIBUTIONPATH'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      # Absolute path to the  tarball directory
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/config/Openbravo.properties.bak
      SEDCOM='s/'tarball.path=xxx'/'tarball.path=$SEDTARDISTRIBUTIONPATH'/g'
      sed $SEDCOM $DISTRIBUTIONPATH/config/Openbravo.properties.bak > $DISTRIBUTIONPATH/config/Openbravo.properties
      #
      # Copying Properties-File and cleanup
      cp $DISTRIBUTIONPATH/config/Openbravo.properties $DISTRIBUTIONPATH/WebContent/WEB-INF/Openbravo.properties
      rm $DISTRIBUTIONPATH/config/Openbravo.properties.bak
            
      # Cleaning Application Dictionary
      echo "Cleaning Application Dictionary"
      cd $TOMPATH/$APP
      rm -rf *
      cd $DISTRIBUTIONPATH
      # ANT-Task for deploy
      echo "Deploying $APP to $TOMPATH......"    
      ant build.deploy
      echo "Application-Directory for $APP deployed..." 
      
      if  [ "$ISNEW" = "N" ]; then
            # RUN Database - Jobs           
            echo "Running Database-Scripts for $APP - Installation of $DISTRI...."
            # Run Database-Upgrade
            java -cp "$DISTRIBUTIONPATH/lib/runtime/*" com.openz.update.ImportModule  DISTRI $TOMPATH/$APP/WEB-INF/Openbravo.properties $DISTRIBUTIONPATH
            if [ "$?" -eq "1" ]; then
                 echo "Database-Scripts returned an ERROR"
                 echo "Updates not complete"
                 echo "You can restart your Server with the Old Version."
                 echo "Please Import last Database Backup before."
                 echo "Also you have to Deploy the last Tarball."
                 exec 1>&3
                 echo "Database-Scripts returned an ERROR"
                 echo "Updates not complete"
                 echo "You can restart your Server with the Old Version."
                 echo "Please Import last Database Backup before."
                 echo "Also you have to Deploy the last Tarball."
                 exit 1
            fi
      else
            echo "New Instance Installation..." 
            if [ "$(id -u)" != "0" ]; then
              exec 1>&3
              echo "In this context this script must be run as root -EXITING"
              exit 1
            fi
            echo "Creating database Users and setting passwords"
              echo "ALTER ROLE postgres with password '$DBMGRPWD';" > /tmp/cmd.sql
              echo "CREATE ROLE TAD;" >> /tmp/cmd.sql
              echo "ALTER ROLE tad with password '$DBUSRPWD';" >> /tmp/cmd.sql
              echo "ALTER ROLE tad login;" >> /tmp/cmd.sql
              echo "ALTER ROLE tad SUPERUSER;" >> /tmp/cmd.sql
              su  postgres -c "psql -U postgres -f /tmp/cmd.sql"
            echo "Creating database"
            su  postgres -c "psql -U postgres -c 'CREATE DATABASE $APP'"
            echo "Importing blank OpenZ database"
            su  postgres -c "psql -U postgres '$APP' < $DISTRIBUTIONPATH/openz.sql"
            echo "New Database installed for  $APP ..." 
            echo "=================================================================================" 
      fi
      
else
      # Setting up Module
      if ! [ -d $DISTRIBUTIONPATH/modules/$DISTRI ]; then
          echo "Module-Directory for $DISTRI does not exist Try to CREATE it.."
          mkdir $DISTRIBUTIONPATH/modules/$DISTRI
      fi
      cd $DISTRIBUTIONPATH/modules/$DISTRI
      cp $TARDISTRIBUTIONPATH/$TARBALL .
      tar -xvf $TARBALL 
      tar -xvf ./openz.tar
      mkdir zssql
      mv sql.tar zssql
      cd zssql
      tar -xvf ./sql.tar
      # Copy sqls to /tmp
      cp $DISTRIBUTIONPATH/modules/$DISTRI/zssql/* /tmp/
      # ANT-Task for deploy
      cd $DISTRIBUTIONPATH/modules/$DISTRI
      echo "Deploying Module $DISTRI into $APP to $TOMPATH......"    
      java -cp "$DISTRIBUTIONPATH/lib/runtime/*" com.openz.update.ImportModule  DISTRI $TOMPATH/$APP/WEB-INF/Openbravo.properties $DISTRIBUTIONPATH/modules/$DISTRI
      if [ "$?" -eq "1" ]; then
                 echo "Database-Scripts returned an ERROR"
                 echo "Updates not complete"
                 echo "You can restart your Server with the Old Version."
                 echo "Please Import last Database Backup before."
                 echo "Also you have to Deploy the last Tarball."
                 exec 1>&3
                 echo "Database-Scripts returned an ERROR"
                 echo "Updates not complete"
                 echo "You can restart your Server with the Old Version."
                 echo "Please Import last Database Backup before."
                 echo "Also you have to Deploy the last Tarball."
                 exit 1
      fi
      cd $DISTRIBUTIONPATH
      cp $TOMPATH/$APP/WEB-INF/Openbravo.properties $DISTRIBUTIONPATH/config
      # Do Compile, if ISNEW was set
      if  [ "$ISNEW" = "N" ]; then
        ant compile.complete
        ant build.deploy
      fi
fi
# Individiual Environment - SED - Manipulatons
# Logging: Manipulating log4j.lcf with SED
cd $TOMPATH/$APP/WEB-INF
cp log4j.lcf log4j.lcf.bak 
SEDCOM='s/'openbravo.log'/'$APP.log'/g'
sed $SEDCOM log4j.lcf.bak > log4j.lcf
# Attachments: Manipulating web.xml with SED
# SED-Search-Condition for attachments-Path in WEB.XML
cp web.xml web.xml.bak
SEDCOM='s/'$SOURCEATTPATH'/'$SEDATTPATH'/g'
sed $SEDCOM web.xml.bak > web.xml
chown -R $TOMCATUSER:$TOMCATUSER $TOMPATH/$APP
chown -R $TOMCATUSER:$TOMCATUSER $DISTRIBUTIONPATH

echo "Deployment of $APP finished.................................."
cd /tmp/
rm *.sql
rm ids
rm $DISTRIBUTIONPATH/$TARBALL
cd $LOGPATH
exit 0
