# makolet-feedback-api-crud
Makolet Feedback API CRUD operations by building a Maven project using Spring Boot 3.1.2, Java 17 and MySQL 8

Features:

- Create new feedback entries
- Retrieve feedback details
- Update existing feedback
- Delete feedback records
- Customize feedback handling to your specific requirements

Prerequisites:

- Java Development Kit (JDK) - Java 17
- Integrated development environment (IDE) - IntelliJ
- MySQL8 database 
- (https://start.spring.io/) for building the maven project using spring boot 3.1.2 and java 17


The Feedback API will be accessible at http://localhost:9191


API Endpoints:

POST /addFeedback: Create a new feedback entry.

POST /addFeedbacks: Create a list of feedback entries.

GET /feedbacks: Retrieves list of all feedback.

GET /feedbackById/{id}: Retrieve feedback by ID.

GET /feedbackById/{name}: Retrieve feedback by Name.

PUT /update: Update existing feedback message by ID.

DELETE /delete/{id}: Delete feedback by ID.
