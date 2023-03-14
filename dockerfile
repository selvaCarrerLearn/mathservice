FROM openjdk:8
EXPOSE 8080
ADD target/maths-service.jar maths-service.jar 
ENTRYPOINT ["java","-jar","/maths-service.jar"]
