FROM openjdk:11
ARG JAR_FILE=/var/lib/jenkins/workspace/deploy_on_k8s/gradle/wrapper/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
