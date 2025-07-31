# Log Consumer Service

This microservice listens to Kafka topics and consumes log messages related to orders and products. It processes and handles logs emitted by other services for monitoring or debugging purposes.

## 🚀 Features

- Consumes order-related logs from the `order-logs` Kafka topic.
- Consumes product-related logs from the `product-logs` Kafka topic.
- Outputs received logs to the console (can be extended for further processing or storage).

## 📦 Tech Stack

- Java 24  
- Spring Boot  
- Spring Kafka  
