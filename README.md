# Projeto DesastreAPI 🌪️  
**RM: 98413**

Este projeto tem como objetivo mitigar os impactos de desastres naturais sobre a população por meio de uma API desenvolvida com **Java + Spring Boot** e práticas modernas de **DevOps**. A aplicação permite o cadastro, visualização e gerenciamento de alertas, abrigos e desastres registrados.

## 🔧 Tecnologias Utilizadas

### Backend
- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Bean Validation
- Lombok
- Swagger (Springdoc OpenAPI)
- Flyway (Migrations)

### DevOps
- Docker
- Docker Compose
- Git + GitHub

---

## ⚙️ Funcionalidades da API

### 🔥 Entidades e Relacionamentos

- **Desastre**
  - Tipo, Local, Data, Nível de Gravidade.
- **Abrigo**
  - Nome, Capacidade, Localização.
- **Alerta**
  - Descrição, Data e Hora, Região Afetada.

### 🔄 Operações Disponíveis (CRUD)

- **Desastres:** `GET`, `POST`, `PUT`, `DELETE`
- **Abrigos:** `GET`, `POST`, `PUT`, `DELETE`
- **Alertas:** `GET`, `POST`, `PUT`, `DELETE`

---

## 🧱 Estrutura do Projeto

