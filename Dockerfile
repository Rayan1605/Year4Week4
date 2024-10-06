# This is an image from Docker Hub with the appropriate version
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app


# Used the mvn clean package command to generate the JAR file
ADD target/Year4Week3-0.0.1-SNAPSHOT.jar /app

# Expose port 8080
EXPOSE 8082

# Run the application
CMD ["java", "-jar", "Year4Week3-0.0.1-SNAPSHOT.jar"]