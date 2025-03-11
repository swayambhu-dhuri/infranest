# InfraNest: Comprehensive Infrastructure & System Design Learning Project

This project aims to demonstrate comprehensive infrastructure and system design skills using a simple microservice-based application with minimal business logic but extensive real-world industry practices.

## 🚀 Overview

The project currently contains two basic microservices:

- **Django REST Framework Microservice** (Python)
- **Spring Boot Microservice** (Java)

These initial setups will later expand to showcase various industry-level best practices around infrastructure, deployment, and system design concepts.

## 🛠️ Current Tech Stack

- **Backend**:
    - Python (Django REST Framework)
    - Java (Spring Boot)

## 🔧 Current Project Structure

```bash
infranest/
├── services/
│   ├── user-service/
│   │   ├── Dockerfile
│   │   └── requirements.txt
│   │
│   └── blog-service/
│       ├── src
│       ├── Dockerfile
│       └── pom.xml
│
├── .gitignore
└── Readme.md
```

## 🌟 How to Run (Locally)

### User Service (Django)

```bash
cd services/user-service
pip install -r requirements.txt
python manage.py runserver
```

### Blog service (Spring Boot)

```bash
cd services/blog-service
mvn spring-boot:run
```

[//]: # (## 🐳 Docker Compose &#40;Local&#41;)

[//]: # ()
[//]: # (```bash)

[//]: # (docker-compose up --build)

[//]: # (```)

