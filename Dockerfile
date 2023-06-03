FROM maven:3.8.4-openjdk-12-slim
WORKDIR /app
COPY . /app
RUN mvn clean install
CMD ["mvn", "test"]
