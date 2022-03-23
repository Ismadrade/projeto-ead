# Projeto EAD - Microsservices com Spring Boot
Curso completo da Michelli Brito, onde é abordado uma estrutura de microsservices. </br>
O projeto será usado como base para criar ou auxiliar outros projetos. </br>
Os arquivos application.yml de cada microsservice, assim como o application.yml geral do projeto se encontra em um projeto privado. 
Os dados do Github usados pelo Config Server foram colocados em variáveis de ambiente, para nao serem expostos no codigo.


<div style="display: inline_block"><br>
  <img align="center" alt="Spring" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />  
  <img align="center" alt="Spring" height="80" width="90" src="https://huongdanjava.com/wp-content/uploads/2019/08/spring-security.png" />   
  <img align="center" alt="Spring" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" />   
  <!-- <img align="center" alt="Docker" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" /> -->
  <img align="center" alt="RabbitMQ" height="80" width="90" src="https://www.vectorlogo.zone/logos/rabbitmq/rabbitmq-icon.svg" />  
  <!-- <img align="center" alt="Linux" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linux/linux-original.svg" /> -->
  <!-- <img align="center" alt="Github Actions" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original-wordmark.svg" /> -->
</div>

# Tecnologias Abordadas:

- Spring Cloud Configuration;
- Spring Boot Actuator;
- Service Registry com Eureka;
- Load Balancing com Eureka e Spring Cloud LoadBalancer;
- Sistema de mensageria por comando e por evento com RabbitMQ
- API Gateway com Spring Cloud Gateway;
- Circuit Breaker com Resilience4j;

# Estrutura do Projeto:

- authuser: responsável por permitir fazer um CRUD de um usuário, bem como a autenticação do sistema.
- course: permite fazer um CRUD de um curso, módulo e lição.
- notification: responsável por criar notificações para determinados eventos, fazendo o uso do rabbitmq
- service registry: Responsável por registrar todos os microserviços
- api gateway: responsável por gerenciar os microserviços, disponibilizando uma unica porta para realizar as requisições.
- config server: responsável por pegar as informações do repositório privado do github e trazer para cada microserviço, o seu application.yml

<img align="center" src="https://i.imgur.com/2cgOkU5.png" />


# Portas dos Projetos:
- Service Registry: 8761
- Config Server: 8888
- Api Gateway: 8080
- Auth User: 8087
- Course: 8082 
- Notification: 8084
