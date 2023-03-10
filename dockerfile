FROM openjdk:1.8-jdk-alpine

ARG JAR_FILE=target/*SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]