FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-github-actions-new.jar spring-boot-github-actions-new.jar
ENTRYPOINT ["java","-jar","/spring-boot-github-actions-new.jar"]