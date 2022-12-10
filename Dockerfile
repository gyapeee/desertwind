FROM maven:3.8-jdk-11 AS builder
ARG WORKDIR=/workdir/server
WORKDIR ${WORKDIR}
COPY pom.xml ${WORKDIR}/pom.xml
COPY src ${WORKDIR}/src
COPY frontend ${WORKDIR}/frontend
RUN mvn clean package

FROM openjdk:11-jre-slim
EXPOSE 8081
ARG WORKDIR=/workdir/server
WORKDIR ${WORKDIR}
ARG JAR_FILE=${WORKDIR}/target/desertwind-0.0.1.jar
COPY --from=builder ${JAR_FILE} app-with-dependencies.jar
ENTRYPOINT ["java","-jar","app-with-dependencies.jar"]
