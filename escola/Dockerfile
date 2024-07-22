# Use uma imagem base oficial do Maven para compilar o projeto
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo pom.xml e baixa as dependências do projeto
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia todo o código-fonte do projeto para o contêiner
COPY src ./src

# Compila o projeto e cria o arquivo JAR
RUN mvn clean package -DskipTests

# Usa uma imagem base oficial do OpenJDK para rodar a aplicação
FROM eclipse-temurin:17-jdk-alpine

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR criado anteriormente para o diretório de trabalho do contêiner
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta 8080
EXPOSE 8080

# Define o comando padrão para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
