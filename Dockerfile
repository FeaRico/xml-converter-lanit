FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} xml-converter.jar

EXPOSE 8080

CMD ["java", "-jar", "xml-converter.jar"]