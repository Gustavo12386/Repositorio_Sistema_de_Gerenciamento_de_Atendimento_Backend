# Repositorio_Sistema_de_Gerenciamento_de_Atendimento_Backend

## 💻 Sobre o Backend do Sistema
- O backend do sistema é composto por quatro APIs, organizadas na arquitetura de microsserviços. O primeiro é o producer, responsável pelo registro das informações de clientes. O segundo é o consumer,
encarregado do envio de e-mails de notificação. O terceiro atua como API Gateway, centralizando e gerenciando as requisições de entrada. Por fim, há o service discovery, responsável pela localização dinâmica
e orquestração dos microsserviços a rede. Os Microsserviços utilizam o sistema de mensageria Kafka, além disso utilizam tecnologias como Eureka,Resilience4j, Swagger para documentação de API e SpringCloud.
Esse backend também apresenta testes de integração relacionados a API de services.

 ## ✨ Tecnologias Utilizadas
- Java 21
- SpringBoot
- SpringCloud
- Resilience4j
- Maven
- PostgreSQL
- Docker/Kubernetes
- Kafka
- Eureka
- Swagger
- Hibernate
- JPA


## 🗒️ Roteiro
- [ ] Criação do sistema com Spring Boot, Maven, JPA e o Hibernate
- [ ] Configuração das APIs service e notification-email
- [ ] Configuração do Swagger na API service
- [ ] Configuração do Kafka nas apis service e notification-email
- [ ] Configuração do SpringCloud e do Resilience4J
- [ ] Criação dos Microsserviços gateway e Service-Registry
- [ ] Configuração do Eureka
- [ ] Realização dos testes de integração na API de services

## 🚀 Como Executar
- Clone o repositório
- Abra em qualquer IDE Java
- Execute o projeto Spring Boot

## Imagem do SwaggerUI com os endpoints da API services
<img width="1579" height="751" alt="cap4" src="https://github.com/user-attachments/assets/189f7cec-b683-488d-a6f9-8164851ae584" />

## Imagens da tabelas do banco de dados das APIs services e notification-email
<img width="1385" height="68" alt="cap1" src="https://github.com/user-attachments/assets/9760cb3e-5f4c-4ac0-9b44-a8f90348e38e" />
<img width="865" height="102" alt="cap2" src="https://github.com/user-attachments/assets/74773452-abbd-44b8-9209-c8ba14a5ee42" />

## Imagem da notificação sendo enviada
<img width="600" height="164" alt="cap3" src="https://github.com/user-attachments/assets/85e8dfd1-77b7-4d41-bfb3-be72bafa5a1d" />

## Autor 
Gustavo Calderaro






