# InfraNest: Infrastructure & System Design Learning Project

InfraNest is a project aimed at learning and implementing comprehensive infrastructure and system design concepts. The focus is on building and deploying microservices using industry-standard tools and best practices.

## 🚀 Overview

Currently, the project consists of:

- **Blog Service (Spring Boot)** - A microservice for managing blog posts, backed by MongoDB.
- **(Upcoming) User Service (Django)** - Will be added later to handle user authentication and profiles.

The goal is to integrate various infrastructure components like containerization, cloud deployment, API gateways, caching, monitoring, and CI/CD pipelines over time.

## 🛠️ Technology Stack

### **Currently Implemented**
- Java 21
- Spring Boot 3.4.3
- Spring Data MongoDB
- Docker & Docker Compose
- Maven

### **Planned Additions**
- Python (Django REST Framework) for User Service
- PostgreSQL for relational data storage
- Redis for caching
- Kafka for event-driven architecture
- Kubernetes for container orchestration
- API Gateway for microservice routing
- CI/CD with GitHub Actions or Jenkins
- Cloud deployment with AWS

## 📂 Project Structure

```bash
Infra/
├── services/
│   └── blog-service/
│       ├── src/
│       ├── Dockerfile
│       ├── docker-compose.yml
│       ├── pom.xml
│       └── README.md
├── Readme.md (Overall project)
└── .gitignore
```

## ⚙️ Running Services

### **Running Blog Service**
```bash
cd services/blog-service
docker-compose up --build
```

The service will be accessible at:
```bash
http://localhost:8080
```

## 📌 API Endpoints (Blog Service)

Base URL: `http://localhost:8080/api/v1`

| Method | Endpoint                  | Description          |
|--------|---------------------------|----------------------|
| GET    | `/api/v1/blogs`           | Get all blogs        |
| GET    | `/api/v1/blogs/{id}`      | Get blog by ID       |
| POST   | `/api/v1/blogs`           | Create a new blog    |
| PUT    | `/api/v1/blogs/{id}`      | Update a blog        |
| DELETE | `/api/v1/blogs/{id}`      | Delete a blog        |

This document will be updated as more services and infrastructure components are added.

