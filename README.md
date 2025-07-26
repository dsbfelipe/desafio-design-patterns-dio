<img src="https://raw.githubusercontent.com/dsbfelipe/readme-banners/main/images/dio.png">
<img align="right" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white">

<br>
<br>

Este repositório contém um projeto de CRUD de Livros desenvolvido em Java com Spring Boot, como prática dos conceitos de Programação Orientada a Objetos, Design Patterns e integração com banco de dados H2 em memória. A ideia principal é aplicar os padrões Facade, Strategy e Singleton de forma prática e integrada ao ecossistema Spring.

## 📝 Objetivo do Projeto

O objetivo deste projeto é exercitar o desenvolvimento de APIs REST com Spring Boot, praticando boas práticas de arquitetura com padrões de projeto clássicos, além de consolidar o uso do Spring Data JPA com banco de dados em memória para fins de testes e prototipação.

## 🔧 Funcionalidades

- **CRUD de Livros**: Criação, leitura e filtragem de registros de livros.

- **Filtragem Dinâmica**: Consulta de livros por diferentes critérios como autor, categoria e disponibilidade.

- **Interface simplificada** com Facade centralizando as operações de serviço.

- **Simulação de repositório em memória** com H2 para facilitar testes.

## 📐 Padrões de Projeto Aplicados

- **Facade**: Centraliza as operações de negócio em uma única interface (LibraryFacade), facilitando o uso pelos controllers e escondendo a complexidade interna dos serviços.

- **Singleton**: Aplicado automaticamente pelo Spring por meio da anotação @Service, garantindo que cada serviço tenha apenas uma instância na aplicação.

- **Strategy**: Permite trocar dinamicamente as estratégias de filtragem de livros (FilterByAuthor, FilterByCategory, FilterByAvailability), deixando a lógica flexível e extensível.

## 📖 Aprendizados

- Estruturação de uma API RESTful completa com Spring Boot.

- Uso real de padrões de projeto no contexto Spring.

- Boa prática de separação de responsabilidades (Controller, Service, Repository, Facade).

- Teste de aplicação com banco de dados em memória (H2).

- Facilidade de extensão e manutenção através de injeção de dependências e interfaces.

## 💻 Tecnologias

- Java JDK 24

- VSCode

- Spring Boot 3+

- Spring Data JPA

- Banco de dados H2

- Gradle

- Postman

- Git & GitHub

## 💡 Créditos

- Projeto realizado no Bootcamp GFT Start #7 - Java, da plataforma DIO em parceria com a GFT.
- Ótima explicação dos conceitos por parte do professor Venilton Falvo JR
