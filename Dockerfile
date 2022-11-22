FROM maven:3.6.3-openjdk-17-slim
COPY src /home/app/src
COPY pom.xml /home/app
WORKDIR /home/app/
RUN mvn install
ENTRYPOINT ["mvn","spring-boot:run"]