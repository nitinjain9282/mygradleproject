
#What is Gradle? 
A framework for building applications. 
It does two things: 
1- Builds the deployment artifacts themselves
2- Manages the dependencies. 

So when we build an application, the actual amount of code that we write ourselves may be very small, but we're using lots of code that we're leveraging from existing libraries and projects. And that concept is referred to as a dependency. And that's the other big feature of Gradle, that it will help us manage these dependencies

Gradle was released in 2007  to allow builds to be described in a different language. Rather than XML, they would be described in a programming language. And that programming language was Groovy, which was a variant of Java. And so now it became easier to make modifications to the build and make them more complicated because we were using a programming language, rather than this declarative XML technique.

# What are key features of Gradle?
- Gradle reads instruction from DSL file called build.gradle. We can lso use groovy or kotlin scripts for low level complex task.
- Gradle parses build.gradle file and gets tasks from that. Then it creates a DAG - Directed Acrylic Graph, which is  a kind of graph of tasks to be done in diection.  
-  It executes these tasks in order it has figured out above. 
- Manages dependencies. 
- Gradle uses repositories 
- The sixth and final key feature of Gradle is that it's self-updating. Gradle can update itself when newer versions are released and also gradle can update dependencies as and when they are released. 

# How gradle works for Java Builds 
We can think of Gradle as sort of the core of a build system but without the knowledge to build any specific kind of application. So the Gradle plugin will allow it to build Java applications.
So the Gradle plugin defines a set of tasks that are specific to Java builds.

we'll say apply plugin Java at the top of the build doc Gradle file. Specifically, the Java plugin adds some tasks that are specific to Java. So, we'll have a clean task that'll clean up the Java byte-code that the Gradle writes out, a compile task, which will actually compile the Java code, an assemble task, which will take the byte-code and turn it into a jar file, and a test task that'll actually run our unit tests.

How is Gradle actually able to use the Maven repository?
Well one of the things that the Gradle developers did to make it easy to adopt Gradle was to use the same format for defining dependencies. So in other words, we can use the same format as Maven so we can take advantage of all the jar files that are already in Maven repositories around the internet.

