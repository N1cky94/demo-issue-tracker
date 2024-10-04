# Issue Tracker

![Status Badge](https://img.shields.io/badge/Status-Configuring-rgb(255%2C150%2C150)?style=plastic&logo=github&logoColor=rgb(255%2C255%2C255)&labelColor=777)
![Version Badge](https://img.shields.io/badge/Version-V0.0.0-rgb(150%2C255%2C150)?style=plastic&logo=github&logoColor=rgb(255%2C255%2C255)&labelColor=777)


> This open-source application is a demo project that will create a issue tracker for ITIL processes.
> This project contains information on: Open source documentation, Use of docker and PostgreSQL, Flyway and more, ...
 
## Table of Contents

- [Required Installation](#installations)
  - [SDK installation](#java-se-17)
  - [Maven](#maven)
- [Running the project](#running-the-project)
  - [IntelliJ IDEA](#using-intellij-idea)
  - [Maven wrapper](#using-maven)

## Installations

### Java SE 17+

You can use SDKman or chocolately to install Java SE 17+.
You can use the following lines to tst your java version and install/activate the needed SE version.

Check the Java version:
```shell
java --version
```

Install the correct JDK version:
```shell
sdk install java 21.ea.35-open
sdk use java 21.ea.35-open
```

### Maven
You don't need to install anything.
Our project is provided with a Maven Wrapper.

## Running the project

### Using IntelliJ IDEA

Create a Run configuration via the sub-menu in IntelliJ.
And run it.

### Using maven

Run the following command to run the code:
```shell
./mvnw clean spring-boot:run