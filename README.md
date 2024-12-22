# Personal Blog

This repository contains the implementation of a **Personal Blog**, developed as part of the Java Development Bootcamp by **Generation Brasil**. The application is built using Spring Boot, with features like authentication, post management, and category organization.

## Features

- **User registration and authentication** using JWT.
- Management of **posts** and **categories** (themes).
- API documentation with **Swagger**.

## Project Structure

### Main Directories

- `src/main/java/com/generation/blogpessoal`
  - **`model`**: Defines the system's entities (Post, Theme, User).
  - **`controller`**: Contains the API endpoints.
  - **`repository`**: Interfaces for database interaction.
  - **`security`**: JWT-based security implementation.
  - **`service`**: Contains business logic.

- `src/main/resources`
  - Configuration files (`application.properties`).

- `src/test`
  - Unit and integration tests.

### Main File

- **`BlogpessoalApplication.java`**: The main class to run the application.

## Requirements

- **Java 17+**
- **Maven 3.8+**
- Relational Database (e.g., MySQL or PostgreSQL).

## How to Run

1. Clone the repository:

   ```
   git clone <repository-url>
   cd blogpessoal-main`

1. Configure the database in the `application.properties` file. 

1. Run the command:

   ```
    ./mvnw spring-boot:run`

1. Access the application at: http://localhost:8080

## Tests

To run the tests:

   `
    ./mvnw test`

## API Documentation

Access the Swagger documentation at: `http://localhost:8080/swagger-ui.html`

## Docker (optional)

A Dockerfile is included to facilitate the creation of Docker images.

##
Developed as part of the Java Development Bootcamp Generation Brasil.
