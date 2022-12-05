FROM maven:3.8-amazoncorretto-11
EXPOSE 8081
ARG JAR_FILE=target/desertwind-1.0.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]