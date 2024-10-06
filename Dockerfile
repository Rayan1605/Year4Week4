# This is an image from Docker Hub with the appropriate version
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file into the container
ADD target/Year4Week3-0.0.1-SNAPSHOT.jar /app

# Expose port 8080
EXPOSE 8082

# Run the application
CMD ["java", "-jar", "Year4Week3-0.0.1-SNAPSHOT.jar"]