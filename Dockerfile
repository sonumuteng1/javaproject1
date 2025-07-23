FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
COPY data/demo.mv.db /data/demo.mv.db
ENTRYPOINT ["java","-jar","/app.jar"]