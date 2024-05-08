FROM openjdk:11
WORKDIR /app
COPY target/openshiftdemo.war app.war
EXPOSE 8080
CMD ["java", "-war", "app.war"]