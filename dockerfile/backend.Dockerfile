# First stage: Build the Spring Boot application
FROM alpine:3.18.4 AS build
WORKDIR /app

RUN apk add --no-cache gcompat libstdc++

RUN apk add maven

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package

# Second stage: Create a minimal JRE-based image
FROM alpine:3.18.4

WORKDIR /app

RUN apk add --no-cache java-cacerts openjdk17-jre

# Copy the JAR file from the first stage into the second stage
COPY --from=build /app/target/topic-service.jar .

ENV JAVA_HOME=/app/target
ENV PATH="$PATH:$JAVA_HOME/bin"

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "topic-service.jar"]