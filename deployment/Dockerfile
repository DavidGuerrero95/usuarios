FROM adoptopenjdk/openjdk11-openj9:alpine-slim

VOLUME /tmp

WORKDIR /app

COPY ms_usuarios_boton/build/libs/*.jar ms_usuarios_boton.jar

ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar ms_usuarios_boton.jar" ]
