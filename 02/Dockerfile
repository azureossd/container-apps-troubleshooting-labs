FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
WORKDIR /usr/src/app
COPY . /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests

FROM eclipse-temurin:21.0.5_11-jdk-alpine
WORKDIR /usr/src/app

COPY --from=build /usr/src/app/target/azure-0.0.1-SNAPSHOT.jar azure-0.0.1-SNAPSHOT.jar
COPY --from=build /usr/src/app/entrypoint.sh entrypoint.sh 
RUN chmod +x entrypoint.sh

EXPOSE 8080

ENTRYPOINT [ "/usr/src/app/entrypoint.sh" ]