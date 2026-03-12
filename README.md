# Task Manager Backend

Backend service for a task management application built with Spring Boot and PostgreSQL.

This project is part of a learning journey focused on building real backend systems using modern technologies and a professional GitHub workflow.

---

## Project Description

The application provides a REST API that allows users to manage tasks.  
Currently the backend supports creating tasks and retrieving all stored tasks.

The main goal of this project is to practice backend development concepts such as:

- REST API design
- Spring Boot application structure
- Database integration using JPA
- PostgreSQL setup
- GitHub issue based development workflow

Future improvements will include additional API endpoints, service layer architecture, validation and authentication.

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Git / GitHub

---

## Installation and Setup

### Requirements

The following tools must be installed:

- Java (JDK 17 or higher)
- PostgreSQL
- Maven
- Git
- IntelliJ IDEA (recommended)

---

### Database Setup

Create a PostgreSQL database.

Database name:
taskmanager

Database user: 
taskuser


Connect to the database:

psql -U taskuser -d taskmanager -h localhost

### Spring Boot Configuration

Database configuration is stored in:

src/main/resources/application.properties

Example configuration:

spring.datasource.url=jdbc:postgresql://localhost:5432/taskmanager
spring.datasource.username=taskuser
spring.datasource.password=taskpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

###  Running the Application

Start PostgreSQL (if installed via Homebrew):
brew services start postgresql@17

Run the Spring Boot application:
./mvnw spring-boot:run

The server will start at:
http://localhost:8080


