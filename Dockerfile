FROM openjdk:19-alpine as builder

VOLUME /tmp

WORKDIR app

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
