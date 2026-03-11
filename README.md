# Task Manager Backend

Backend service for a simple task management application built with Spring Boot.

This project is part of a learning project to build a full-stack task management system using modern backend technologies.

---

# Tech Stack

- Java
- Spring Boot
- PostgreSQL
- Maven
- Git

---

# Requirements

The following tools must be installed locally:

- Java (JDK)
- PostgreSQL
- Maven
- Git
- IntelliJ IDEA (recommended)

---

# Database Setup

The backend uses PostgreSQL as the database.

A database and user were created for this project.

Database name:

taskmanager

Database user:

taskuser

To connect manually to the database using the terminal:

psql -U taskuser -d taskmanager -h localhost

You will be asked for the database password.

---

# Spring Boot Database Configuration

Database configuration is stored in:

src/main/resources/application.properties

Example configuration:

spring.datasource.url=jdbc:postgresql://localhost:5432/taskmanager
spring.datasource.username=taskuser
spring.datasource.password=taskpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

Explanation:

spring.datasource.url – database location  
spring.datasource.username – database user  
spring.datasource.password – database password  
spring.jpa.hibernate.ddl-auto=update – automatically updates database tables based on entities  
spring.jpa.show-sql=true – prints SQL queries in the console

---

# Running PostgreSQL

If PostgreSQL is installed via Homebrew, start the service with:

brew services start postgresql@17

Check running services:

brew services list

---

# Run the Application

You can run the application directly from IntelliJ IDEA.

Or from the terminal using Maven:

./mvnw spring-boot:run

or

mvn spring-boot:run

The application will start on:

http://localhost:8080

---

# Project Structure

The project follows a typical Spring Boot backend structure.

src/main/java/com/ivan/taskmanager

controller  
service  
repository  
model  
config

These packages will contain:

controller – REST API endpoints  
service – business logic  
repository – database access  
model – entity classes  
config – configuration classes

---

# Development Notes

Useful commands during development.

Connect to the database:

psql -U taskuser -d taskmanager -h localhost

Start PostgreSQL:

brew services start postgresql@17

Check PostgreSQL status:

brew services list

---

# Current Status

Project setup completed:

- Spring Boot project created
- PostgreSQL installed and configured
- Database connection working
- README documentation added

Next step:

Implement the first REST controller and create the first API endpoint.