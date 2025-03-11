# Blog Service (Spring Boot)

This is a Spring Boot microservice designed as part of the InfraNest project, aimed at demonstrating comprehensive infrastructure and system design skills. This service provides RESTful APIs for managing blogs and integrates seamlessly with MongoDB as the database.

## 🚀 Overview

The Blog Service is a RESTful API built with Spring Boot, primarily focusing on basic CRUD operations to manage blog posts. This service is containerized using Docker and uses MongoDB for persistent data storage.

## 🛠️ Technology Stack

- Java 21
- Spring Boot 3.4.3
- Spring Data MongoDB
- Maven
- Docker & Docker Compose

## 📂 Project Structure

```bash
blog-service/
├── src/
│   └── main/
│       ├── java/com/swayam/infra/blog/
│       │   ├── controller/
│       │   ├── service/
│       │   ├── repository/
│       │   └── model/
│       └── resources/
│           └── application.properties
├── Dockerfile
├── docker-compose.yml
└── pom.xml
```

## ⚙️ Running Locally

### Using Docker Compose

```bash
docker-compose up --build
```

The application will be accessible at:

```bash
http://localhost:8080
```

## 📌 API Endpoints

Base URL: `http://localhost:8080/api/v1`

### Blogs API

| Method | Endpoint                  | Description          |
|--------|---------------------------|----------------------|
| GET    | `/api/v1/blogs`           | Get all blogs        |
| GET    | `/api/v1/blogs/{id}`      | Get blog by ID       |
| POST   | `/api/v1/blogs`           | Create a new blog    |
| PUT    | `/api/v1/blogs/{id}`      | Update a blog        |
| DELETE | `/api/v1/blogs/{id}`      | Delete a blog        |