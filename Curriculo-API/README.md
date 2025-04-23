# Curriculo API

Este projeto é uma API REST desenvolvida com Spring Boot e PostgreSQL, destinada ao gerenciamento de currículos. A API permite o cadastro e a consulta de informações de currículos de várias pessoas, incluindo suas experiências profissionais.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

```
curriculo-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── exemplo
│   │   │           └── curriculoapi
│   │   │               ├── CurriculoApiApplication.java
│   │   │               ├── controller
│   │   │               │   └── CurriculoController.java
│   │   │               ├── model
│   │   │               │   ├── Curriculo.java
│   │   │               │   └── Experiencia.java
│   │   │               ├── repository
│   │   │               │   ├── CurriculoRepository.java
│   │   │               │   └── ExperienciaRepository.java
│   │   │               └── service
│   │   │                   └── CurriculoService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── exemplo
│                   └── curriculoapi
│                       └── CurriculoApiApplicationTests.java
├── pom.xml
└── README.md
```

## Dependências

O projeto utiliza as seguintes dependências:

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- PostgreSQL Driver

## Configuração do Banco de Dados

As configurações do banco de dados devem ser definidas no arquivo `src/main/resources/application.properties`. Certifique-se de incluir a URL do banco de dados, usuário e senha.

## Inicialização do Banco de Dados

O arquivo `src/main/resources/data.sql` pode ser utilizado para inicializar o banco de dados com dados de exemplo quando a aplicação é iniciada.

## Execução da Aplicação

Para executar a aplicação, utilize o Maven. No diretório raiz do projeto, execute o seguinte comando:

```
mvn spring-boot:run
```

## Testes

Os testes de unidade estão localizados em `src/test/java/com/exemplo/curriculoapi/CurriculoApiApplicationTests.java`. Eles garantem que o contexto da aplicação seja carregado corretamente.

## Contribuição

Sinta-se à vontade para contribuir com melhorias ou correções. Para isso, faça um fork do repositório e envie um pull request.