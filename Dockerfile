FROM eclipse-temurin:17-jdk-focal
EXPOSE 2008
ADD target/spring-0.0.1-SNAPSHOT.jar spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-0.0.1-SNAPSHOT.jar"]