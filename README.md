Fitness App Microservices

This project is a learning implementation of a Fitness App Microservices application, built following a YouTube tutorial by EmbarkXOfficial. The purpose of this repository is for educational and practice purposes only.

> ⚠ Note: This project is not original; it is based on the tutorial and modified for learning.

📚 Learning Goals

This project helped me understand:

Java and Spring Boot fundamentals

Microservices architecture

RESTful API development

Service discovery with Eureka

API Gateway implementation

Working with multiple microservices in a single application


🛠 Project Structure

User Service – Handles user registration, login, and profiles

Activity Service – Tracks user workouts and activities

AI Service – Provides AI-based fitness recommendations

API Gateway – Entry point for client requests

Eureka Server – Service discovery

Config Server – Centralized configuration


🚀 Getting Started

1. Clone the Repository
git clone https://github.com/EmbarkXOfficial/fitness-app-microservices.git
cd fitness-app-microservices

2. Set Up MySQL Databases
Create required databases (e.g., user_db, activity_db) and update the database credentials in each service’s application.properties.


3. Run the Services
4. 
Start services in this order:

Eureka Server

Config Server

User Service

Activity Service

AI Service

API Gateway


Use:

mvn spring-boot:run

for each service.


4. Access the Application

Open:

http://localhost:8080

The API Gateway will route requests to the respective microservices.

📄 API Endpoints

Some example endpoints:

User Service: /users, /users/register, /users/login

Activity Service: /activities

AI Service: /recommendations


(Full endpoints available in the respective service folders.)

🤝 Acknowledgements

This project was created for learning purposes by following the YouTube tutorial from EmbarkXOfficial:
YouTube Channel
