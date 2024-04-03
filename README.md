# Projeto de Gerenciamento de Alunos - Microserviço de Alunos

Este é um projeto de exemplo para demonstrar como criar um microserviço para gerenciamento de alunos usando Spring Boot.

## Visão Geral

Este projeto consiste em um microserviço que fornece operações CRUD (Create, Read, Update, Delete) para gerenciar alunos em uma universidade.

## Funcionalidades

- Listar todos os alunos
- Adicionar um novo aluno
- Obter informações de um aluno específico
- Atualizar informações de um aluno
- Excluir um aluno

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- MySQL (ou outro banco de dados relacional)
- Maven (ou Gradle) para gerenciamento de dependências

## Configuração do Ambiente

### Requisitos

- Java JDK 8 ou superior
- Maven 3.x (ou Gradle)

### Configuração do Banco de Dados

- Configure seu banco de dados no arquivo `application.properties` ou `application.yml`.

Exemplo de configuração para MySQL:

```yaml
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update
