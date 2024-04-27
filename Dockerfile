FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-github-actions.jar spring-boot-github-actions.jar
ENTRYPOINT ["java","-jar","/spring-boot-github-actions.jar"]