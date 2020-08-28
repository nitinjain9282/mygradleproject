# mygradleproject1
 
#This is just sample project to undetstand gradle concepts. 
--------------------------------------------------------------------
Step1: 
L:\mylearning\mygradleproject
Just download this source code and import it using IntelliJ Idea Community.
Pain points:  finding the gson library manually and adding to classpath. Also, any update to this library has to be manually addressed. 
              Will see next how we can overcome this with gradle. 
Done - tag-1.0.0 created with source files without build.

Right click and add Gson library to classpath. 

Right click and run java main to produce below output: 
output:
SaleEvent: 100, 123 Main St., Naperville
{"id":"100","streetAddress":"123 Main St.","city":"Naperville"}

--------------------------------------------------------------------

In this part, we are adding simple build.gradle file and perform simple gradle build. 
Once we have added steps 1-4 in build.gradle then we can open terminal again and run command ' gradle build'.
This does two things -
1- Added build directory which contains SaleEvents.class
2- in libs folder, it built our project Artifact which is mygradleproject1.jar
Done - tags-1.0.2 
-----------------------------------------------------------------------------