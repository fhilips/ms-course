# Microserviços com Spring Boot e Spring Cloud

Este projeto teve como objetivo desenvolver um exemplo prático de uma arquitetura baseada em microserviços.
O projeto consiste no acesso de um usúario a rotas, de acordo com seu nível de permissionamento. As rotas consistem em acesso a informações dos trabalhadadores, cálculo de pagamento, encontrar usuários e configurações dos microserviços.

### Divisão do projeto

---

O projeto está dividido nas Branchs main e docker. Esta última, com as configurações para prod e dev e criação dos containers docker.

## 📝 Fases do projeto

Resumo dos passos e dos conhecimentos adquiridos durante o desenvolvimento do projeto.

### Fase 1

Iniciamos realizando uma comunicação simples entre os microserviços hr-worker e hr-payroll através de um restTemplate. Logo após, substituímos a comunicação simples utilizando o FeignClient, onde criamos uma interface para a definição dos metódos a serem utilizados pela service. Para o balanceamento de carga utilizamos o Ribbon.
Também realizamos a criação e mock do hr-payroll, além da configuração do banco em memória h2.

### Fase 2

Criação do hr-eureka-server, que será o servidor onde todos os microserviços se registrarão (realizará o balanceamento de cargas, dispensando o Ribbon). Foi feito também a configuração dos clientes Eureka.
Utilizamos o Hystrix para tolerancia a falhas.
Criamos o projeto hr-api-gateway-zull, que servirá como o api gateway(faz a comunição entre os clientes externos e os respectivos microserviços).

### Fase 3

Criação do hr-config-server, que será o servidor de configuração dos microserviços. Actuator para atualizar configurações em runtime.

### Fase 4

Criação dos projetos hr-user e hr-oauth, que farão o processo de consulta na base de dados do usuário e a autenticação. Configuramos o hr-api-gateway-zull, como server de autorização das rotas. Também foi feita a configuração de cors.

---

## Tecnologias Utilizadas

- Spring Boot + Spring Cloud
- Spring Cloud Netflix
- Eureka Server
- Oauth2 com Spring Security
- JWT
- H2 Database
- PostgreSQL 12
- Docker

---

## ✍️ Autor

Filipe dos Santos
