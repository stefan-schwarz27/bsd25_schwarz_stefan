# Exercise 2 - Maven and Git Branches

## System Versions

```text
java -version:
openjdk version "21.0.11" 2026-04-21
OpenJDK Runtime Environment (build 21.0.11+10-1-24.04.2-Ubuntu)
OpenJDK 64-Bit Server VM (build 21.0.11+10-1-24.04.2-Ubuntu, mixed mode, sharing)

javac -version:
javac 21.0.11

mvn -v:
Apache Maven 3.8.7
Maven home: /usr/share/maven
Java version: 21.0.11, vendor: Ubuntu, runtime: /usr/lib/jvm/java-21-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.17.0-35-generic", arch: "amd64", family: "unix"

git --version:
git version 2.43.0

Branch init_project
Created the branch init_project.
Created a Maven project inside the existing repository.
Verified that .git, pom.xml, and src/ are located in the same root directory.
Created and updated the .gitignore file.
Created the README.md file.
Added a link to exercise2.md in the README.md file.
Committed the changes.
Pushed the branch init_project to the remote repository.
Merged the branch into main.

Branch calculator
Created the branch calculator.
Created the package at.campus02.bsd.
Created the class Calculator.
Created the class Main.
Implemented the methods add, subtract, divide, and multiply.
Used double values for parameters and return values.
Called each calculator method once in the main method.
Built the project with mvn compile.
Started the application with mvn exec:java.
Added my name to the console output.
After building the project, the folder target/ was created.
Saved a screenshot of the repository folder as resources/images/ex2_1.png.
Saved a screenshot of the successful mvn compile build as resources/images/ex2_2.png.
Saved a screenshot of the successful mvn exec:java execution as resources/images/ex2_3.png.
Committed the changes.
Pushed the branch calculator to the remote repository.
Merged the branch into main.


Branch logging
Created the branch logging.
Updated .gitignore to exclude log files and the local Log4j configuration file.
Added Log4j as a Maven dependency.
Created and tested a logger in the Main class.
Saved a screenshot of the console logging output as resources/images/ex2_4.png.
Added a logger to the Calculator class.
Each calculator method writes a debug message containing the method parameters.
The divide method checks for division by zero and writes an error message if necessary.
The log file is created locally under logs/myapp.log.
The log file is not stored in version control.
Created a Log4j template file under src/main/resources/log4j2.xml.template.
The local file src/main/resources/log4j2.xml is ignored by Git.
Saved a screenshot of the log file content as resources/images/ex2_5.png.
Committed the changes.
Pushed the branch logging to the remote repository.
Merged the branch into main.


Final Check
Checked the repository on GitHub.
Verified that the branches init_project, calculator, and logging are visible on GitHub.
Verified that the pull requests were created and merged.
Verified that the main branch contains the final project state.
Verified that generated files and folders such as target/, logs/, and .idea/ are not stored in the repository.
Verified that the screenshots ex2_1.png to ex2_5.png are stored under resources/images/.
Verified that README.md links to exercise2.md.
```
