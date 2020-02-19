# Epam Week-4 Project

Project done in Maven by implementing the CleanCode
Maven Project Creation Process:
**Step 1:** *Checking the installation of Maven in the system*
```s
mvn --version
```
**Step 2:** *Creating Maven project through command line*
```s
mvn archetype:generate -DgroupId=com.mycompany.calculator -DartifactId=calculator -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
**Step 3:** *Build the Maven Project*
```s
mvn package
```
**Step 4:** *Testing the Maven Project*
```s
mvn test
```

# Project Idea

>Two problems are created as two seperate Maven projects.
>Each input is taken using constructor of the class.
>A single object instantiation is done in main class as required.
>**PrintStream** is used to print output as System.out.println() is restrained.
