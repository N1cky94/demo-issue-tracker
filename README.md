# Issue Tracker

![Status Badge](https://img.shields.io/badge/Status-Configuring-rgb(255%2C150%2C150)?style=plastic&logo=github&logoColor=rgb(255%2C255%2C255)&labelColor=777)
![Version Badge](https://img.shields.io/badge/Version-V0.0.1-rgb(150%2C255%2C150)?style=plastic&logo=github&logoColor=rgb(255%2C255%2C255)&labelColor=777)


> This open-source application is a demo project that will create a issue tracker for ITIL processes.
> This project contains information on: Open source documentation, Use of docker and PostgreSQL, Flyway and more, ...
 
## Table of Contents

- [Required Installation](#installations)
  - [SDK installation](#java-se-17)
  - [Maven](#maven)
  - [Docker](#docker)
- [Running the project](#running-the-project)
  - [IntelliJ IDEA](#using-intellij-idea)
  - [Maven wrapper](#using-maven)

## Installations

### Environment Variables

Make sure that in IntelliJ your environment variables are set.
You can use the below string, and fill it in with your own credentials:
```text
DB_USER=user;DB_PASSWORD=psw;DB_URL=jdbc:postgresql://localhost:5432/db-name;DB_DATABASE=db-name
```

Also create a `.env` folder, with the same credentials, in the root of the project.
This is needed to run the Docker containers.

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

### Docker

You need Docker Desktop or Docker CLI installed on your machine.
We provided a [simple docker-compose file](docker-compose.yml) to start the database we are using in development mode that mirors production.

You can find install information via these links:
- [for Mac](https://docs.docker.com/desktop/install/mac-install/)
- [for Windows](https://docs.docker.com/desktop/install/windows-install/)
- [for Linux](https://docs.docker.com/desktop/install/linux/)

To run the docker containers you will need the following commands:
```shell
docker compose up -d
```
> The `-d` flag will start the container in a detached mode.

To stop the container and delete all data:
```shell
docker compose down -v
```
> The `-v` flag will delete all volumes.

## Running the project

Before running the project, make sure you have the database up and running locally.
See the [Docker](#docker) section for more information.

### Using IntelliJ IDEA

Create a Run configuration via the sub-menu in IntelliJ.
And run it.

### Using maven

Run the following command to run the code:
```shell
./mvnw clean spring-boot:run
```

