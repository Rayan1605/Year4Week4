FROM openjdk:17

WORKDIR /app

ADD target/SecondRepoForWeek3-0.0.1-SNAPSHOT.jar /app

# Expose port 8080
EXPOSE 8080

# Runing the application
CMD ["java", "-jar", "SecondRepoForWeek3-0.0.1-SNAPSHOT.jar"]