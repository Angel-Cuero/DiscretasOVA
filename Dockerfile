FROM openjdk:23
#RUN apt-get update && apt-get install -y libcjson1 libcjson-dev
VOLUME /tmp
EXPOSE 8094
ARG JAR_FILE=target/discretas-jni-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
COPY libdiscretas.so /usr/lib/
ENTRYPOINT ["java","-Djava.library.path=/usr/lib","-jar","app.jar"]

#ENV LD_LIBRARY_PATH=/usr/local/lib/jni:/lib64:$LD_LIBRARY_PATH