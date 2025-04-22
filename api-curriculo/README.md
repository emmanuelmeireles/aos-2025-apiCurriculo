# API Currículo

Este projeto é uma API REST desenvolvida com Spring Boot, destinada a gerenciar currículos. A API permite criar, ler, atualizar e deletar informações de currículos, facilitando a gestão de dados de candidatos.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

```
api-curriculo
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── apicurriculo
│   │   │               ├── ApiCurriculoApplication.java
│   │   │               ├── controller
│   │   │               │   └── CurriculumController.java
│   │   │               ├── model
│   │   │               │   └── Curriculum.java
│   │   │               ├── repository
│   │   │               │   └── CurriculumRepository.java
│   │   │               └── service
│   │   │                   └── CurriculumService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── apicurriculo
│                       └── ApiCurriculoApplicationTests.java
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Dependências

O projeto utiliza Maven como gerenciador de dependências. As principais dependências incluem:

- Spring Boot Starter Web: Para construir a API REST.
- Spring Data JPA: Para interagir com o banco de dados.
- Driver de banco de dados: Para conectar-se ao banco de dados escolhido.

## Configuração

Para configurar o projeto, siga os passos abaixo:

1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Execute o comando `./mvnw spring-boot:run` (Linux/Mac) ou `mvnw.cmd spring-boot:run` (Windows) para iniciar a aplicação.

## Endpoints

A API expõe os seguintes endpoints para manipulação de currículos:

- `POST /curriculums`: Cria um novo currículo.
- `GET /curriculums`: Retorna todos os currículos.
- `GET /curriculums/{id}`: Retorna um currículo específico pelo ID.
- `PUT /curriculums/{id}`: Atualiza um currículo existente.
- `DELETE /curriculums/{id}`: Deleta um currículo pelo ID.

## Testes

Os testes unitários estão localizados no diretório `src/test/java/com/example/apicurriculo`. Eles garantem que a lógica de negócios e os endpoints da API funcionem corretamente.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.