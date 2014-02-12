#!/bin/sh

jnaerate (){
 java -jar jnaerator.jar $1
 #echo "cccc"
 if [ $? -eq 0 ] 
 then 
   echo "jnaeration using $1 succeded"
   return 0
 else
   echo "jnaeration using $1 failed"
   return 1
 fi 
}  

jnaerate gobject.jnaerator
if [ $? -eq 0 ] 
then 
  jnaerate gstreamer.jnaerator
else
  echo "exiting because of error in gobject.jnaerator"
fi
