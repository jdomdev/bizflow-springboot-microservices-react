# Enterprise Management System with Microservices Architecture

## Project Overview
This is an enterprise-level web application developed using **Spring Boot** for the backend and **React** for the frontend. It is designed to manage various internal business operations such as expense notes, user authentication with roles, inventory management, and employee management. Each function is managed by its own **microservice**. The system supports **JWT-based authentication**, **OAuth2 authorization**, and utilizes **Docker** and **Kubernetes** for containerization and orchestration.

## Technologies Used
### Backend
- **Spring Boot (JDK 21)**: Implements microservices for different business functions (expense notes, users, inventory).
- **PostgreSQL**: For data storage and management.
- **OAuth2 + JWT**: For secure authentication and authorization.
- **APIs**: RESTful services for communication between microservices.

### Frontend
- **React**: User interface for accessing and interacting with the system.
- **Redux**: State management for handling complex data flows across components.
- **Material-UI**: A modern and responsive UI framework.
- **Axios**: For making HTTP requests to the backend microservices.

### DevOps & Deployment
- **Docker**: Containerization of the microservices.
- **Kubernetes**: For orchestration of containers and scaling.
- **CI/CD**: Integration with GitHub Actions or Jenkins for automated builds and deployment.

### Testing
- **JUnit**: Backend unit and integration testing.
- **Jest** & **React Testing Library**: For frontend testing.

## Key Features
- **Expense Notes Microservice**:
  - Employees can manage their own expense notes.
  - Admins can perform full CRUD operations on any expense.
  - Users may or may not be employees but require proper authentication to access the system.
  
- **User Authentication & Role Management**:
  - Role-based access control using **JWT** tokens.
  - Admins and Users have different permissions across services.
  
- **Inventory Management Microservice**:
  - Manage company inventory such as electronic devices (PCs, smartphones, tablets, etc.).
  
- **Employee Management Microservice**:
  - Manage employee records, roles, and access within the organization.

## Architecture
- **Microservices Architecture**: Each business function (Expense Notes, User Management, Inventory, etc.) is isolated into its own service.
- **REST APIs**: Each microservice communicates via RESTful APIs, promoting loose coupling.
- **OAuth2 & JWT**: Secure user authentication with role-based access control.

## Getting Started

### Prerequisites
- **Java 21**: Ensure JDK 21 is installed.
- **Node.js**: Required for running the React frontend.
- **Docker & Kubernetes**: For containerizing and orchestrating services.
- **PostgreSQL**: Database for storing data.

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/jdomdev/bizflow-springboot-microservices-react.git
   cd enterprise-management-system
   ```

2. **Backend (Spring Boot) Setup**:
   - Navigate to each microservice (`expense-service`, `inventory-service`, etc.), and run:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```
   - Make sure PostgreSQL is running and configured.

3. **Frontend (React) Setup**:
   - Navigate to the `frontend` directory and run:
     ```bash
     npm install
     npm start
     ```

4. **Docker Setup**:
   - Build the Docker images for each microservice:
     ```bash
     docker-compose up --build
     ```

5. **Kubernetes Setup**:
   - Deploy microservices using Kubernetes:
     ```bash
     kubectl apply -f k8s/
     ```

### Environment Variables
Make sure to configure the following environment variables in `.env` for local development:
- `DATABASE_URL`
- `JWT_SECRET`
- `OAUTH2_CLIENT_ID`
- `OAUTH2_CLIENT_SECRET`

## API Endpoints

### Expense Notes Service
- **GET** `/api/expenses` – Retrieve a list of all expenses (Admin only).
- **POST** `/api/expenses` – Add a new expense (User).
- **PUT** `/api/expenses/{id}` – Update an expense (Admin).
- **DELETE** `/api/expenses/{id}` – Delete an expense (Admin).

### Authentication Service
- **POST** `/api/auth/login` – User login and token generation.
- **POST** `/api/auth/register` – Register a new user.

## Testing

### Backend
Run tests for each microservice:
```bash
mvn test
```

### Frontend
Run React tests using Jest:
```bash
npm test
```

## Future Enhancements
- **E-Commerce Microservice**: Add functionality for online shopping.
- **Integration with Payment Gateway**: Enable secure transactions for e-commerce.
- **Reporting and Analytics**: Generate reports for expense and inventory data.

## License
This project is licensed under the MIT License.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

```

This README outlines the structure and purpose of your project, including the tools, technologies, and instructions needed to run it. It also showcases some best practices for maintaining the project and contributing to it.
