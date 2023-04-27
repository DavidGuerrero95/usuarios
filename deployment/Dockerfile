FROM adoptopenjdk/openjdk11-openj9:alpine-slim
VOLUME /tmp
EXPOSE 8080
ENV JAVA_OPTS="-XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom"
WORKDIR /userapp
COPY app-service.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar app.jar" ]