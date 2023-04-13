FROM openjdk:8
ADD target/springboot-jpa-0.0.1-SNAPSHOT.jar springboot-jpa-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-jpa-0.0.1-SNAPSHOT.jar"]