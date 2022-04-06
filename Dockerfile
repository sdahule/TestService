FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/TestService-0.0.1-SNAPSHOT.jar TestService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/TestService-0.0.1-SNAPSHOT.jar"]