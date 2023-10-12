FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

ENV MYSQL_URL jdbc:mysql://mysql-server:3306/petclinic
ENV MYSQL_USER petclinic
ENV MYSQL_PASS petclinic

COPY .mvn/ .mvn
COPY pom.xml mvnw ./

RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles.active=mysql"]