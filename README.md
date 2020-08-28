# mygradleproject1
 
#This is just sample project to undetstand gradle concepts. 
source: https://www.linkedin.com/learning/gradle-for-java-developers/simple-java-example
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

Commit tag 1.0.0
--------------------------------------------------------------------
In this part, we are adding simple build.gradle file and perform simple gradle build. 
Once we have added steps 1-4 in build.gradle then we can open terminal again and run command ' gradle build'.
This does two things -
1- Added build directory which contains SaleEvents.class
2- in libs folder, it build our project Artifact which is build/libs/mygradleproject.jar
Done - tags-1.0.1_first_gradle_build.
--------------------------------------------------------------------------
WE can close IntelliJ and reopen project. It gives popup to import as gradle project. 
Alternatively, we can copy this dir and import freshly as gradle project in IntelliJ. 
On running gradle build in terminal, following changes happen: 
1- gradle dir with gradle-wrapper.jar and gradle-wrapper.properties created. 
2- src dir structure changed as per maven standards. 

gradle/wrapper/gradle-wrapper.jar is produced as before as end result of gradle build. 
Done - tags-1.0.2_import_as_gradle_project.
