FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD docker-ci-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dname=test","-jar","/app.jar"]
EXPOSE 8080