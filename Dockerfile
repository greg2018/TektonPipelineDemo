FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
COPY target/TektonPipelineDemo-0.0.1.jar /opt/app
CMD ["java", "-jar", "/opt/app/TektonPipelineDemo-0.0.1.jar"]

EXPOSE 8080