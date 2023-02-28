FROM maven:3.8.5-openjdk-11-slim
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve dependency:resolve-plugins
COPY . .
#RUN mvn -e -DskipTests=true package
#RUN mvn clean install -DskipTests=true -Dos.detected.classifier=linux-aarch_64
EXPOSE 50051
ENTRYPOINT ["mvn", "exec:java"]
