# Repositorio_Sistema_de_Gerenciamento_de_Atendimento_Backend

## 💻 Sobre o Backend do Sistema
- O backend do sistema é composto por quatro APIs, organizadas na arquitetura de microsserviços. O primeiro é o producer, responsável pelo registro das informações de clientes. O segundo é o consumer,
encarregado do envio de e-mails de notificação. O terceiro atua como API Gateway, centralizando e gerenciando as requisições de entrada. Por fim, há o service discovery, responsável pela localização dinâmica
e orquestração dos microsserviços a rede. Os Microsserviços utilizam o sistema de mensageria Kafka, além disso utilizam tecnologias como Eureka,Resilience4j, Swagger para documentação de API e SpringCloud, a utilização do SonarQube para automatizar a análise da qualidade e segurança do código de software, detectando erros, vulnerabilidades e "code smells" (problemas que podem se tornar erros) e a utilização das ferramentas Prometheus e Grafana para monitoramento e observabilidade.
Esse backend também apresenta testes de integração relacionados a API de services, e também duas branches uma branch com os serviços sendo executados pelo Docker Compose e a outra chamada de Kubernetes com os serviços rodando pelo Kubernetes.

 ## ✨ Tecnologias Utilizadas
- Java 21
- SpringBoot
- SpringCloud
- Resilience4j
- Maven
- Docker/Kubernetes
- PostgreSQL
- Kafka
- Eureka
- SonarQube
- Swagger
- Hibernate
- JPA
- Prometheus
- Grafana


## 🗒️ Roteiro
- [ ] Criação do sistema com Spring Boot, Maven, JPA e o Hibernate
- [ ] Configuração das APIs service e notification-email
- [ ] Configuração do Swagger na API service
- [ ] Configuração do Kafka nas apis service e notification-email
- [ ] Configuração do SpringCloud e do Resilience4J
- [ ] Criação dos Microsserviços gateway e Service-Registry
- [ ] Configuração do Eureka
- [ ] Realização dos testes de integração na API de services
- [ ] Utilização do SonarQube para análise da qualidade do código
- [ ] Utilização do Prometheus e Grafana para monitoramento e observabilidade

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

## Imagem do Painel do Eureka
<img width="1562" height="817" alt="Captura de tela 2025-12-04 110624" src="https://github.com/user-attachments/assets/3631c64e-ac98-4b3c-b06a-def8da71a767" />

## Imagem do teste de qualidade do microsservico Service
<img width="1545" height="789" alt="Captura de tela 2025-12-03 143910" src="https://github.com/user-attachments/assets/584b842a-e404-4bac-acd7-dc940aa4435d" />

## Imagem do teste de qualidade do microsservico de Notificação
<img width="1450" height="784" alt="Captura de tela 2025-12-03 152637" src="https://github.com/user-attachments/assets/bdd970f2-4183-4cc4-a559-8098187b710e" />

## Imagem do teste de qualidade do microsservico Gateway
<img width="1472" height="771" alt="Captura de tela 2025-12-03 205053" src="https://github.com/user-attachments/assets/25baf58b-3618-42ce-8a11-fef5ada8f2d9" />

## Imagem do teste de qualidade do microsservico Service Registry
<img width="1374" height="764" alt="Captura de tela 2025-12-03 210453" src="https://github.com/user-attachments/assets/28ca34fc-534c-4e65-8f87-7e768a5e6384" />

## Imagem do Prometheus
<img width="1902" height="452" alt="Captura de tela 3" src="https://github.com/user-attachments/assets/3d08da43-529e-49cd-bc15-492818b06c07" />

## Imagens do Grafana
<img width="1602" height="752" alt="Captura de tela " src="https://github.com/user-attachments/assets/3aff531a-4fff-49e1-af8b-ad9a579b037b" />
<img width="1612" height="766" alt="Captura de tela 2" src="https://github.com/user-attachments/assets/95d8d3e4-c11d-4464-aacc-d5c0510249b3" />

## Autor 
Gustavo Calderaro






