# This is a image from Docker Hub with appropriate version
FROM openjdk:17
#Set the working directory inside the container
WORKDIR /app

#To get the Jar file -> package it from maven and it will generate the Jar file
ADD target/Year4Week3-0.0.1-SNAPSHOT.jar /app
#Exposing port 8080
EXPOSE 8080

##This is how you run it in cmd
CMD ["java","-jar","Year4Week3-0.0.1-SNAPSHOT.jar"]