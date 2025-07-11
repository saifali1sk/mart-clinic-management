# -------- Build Stage --------
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copy source code and build the application
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# -------- Runtime Stage --------
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy only the compiled JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

