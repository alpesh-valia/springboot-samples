FROM openjdk:8-jre-slim
COPY ./greeting-application/build/libs/application-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]