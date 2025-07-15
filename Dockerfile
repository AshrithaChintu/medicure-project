# 🌼 Use official Java base image
FROM openjdk:17-jdk-slim

# 🌼 Add metadata
LABEL maintainer="AshrithaChintu"

# 🌼 Set working directory
WORKDIR /app

# 🌼 Copy JAR file into container
COPY target/medicure-0.0.1-SNAPSHOT.jar medicure.jar

# 🌼 Expose the port
EXPOSE 8080

# 🌼 Run the app
ENTRYPOINT ["java", "-jar", "medicure.jar"]

