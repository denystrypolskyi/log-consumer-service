FROM eclipse-temurin:24-jdk-alpine
WORKDIR /app
COPY target/log-consumer-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
