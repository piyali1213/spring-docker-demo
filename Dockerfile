FROM openjdk:17
ADD target/spring-docker-demo-0.0.1-SNAPSHOT.jar spring-docker-demo.jar
ENTRYPOINT ["java" , "-jar", "spring-docker-demo.jar"]