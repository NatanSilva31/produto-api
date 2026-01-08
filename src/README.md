# Produto API

API REST desenvolvida em **Spring Boot** para gerenciamento de produtos, permitindo cadastro, listagem e atualização de informações básicas.

Projeto criado com foco em boas práticas de organização em camadas (Controller, Service, Repository) e exposição de endpoints RESTful.

---

## 🚀 Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 📦 Funcionalidades
- Criar produto
- Listar produtos
- Buscar produto por ID
- Atualizar preço do produto
- Atualizar status do produto

---

## 🔗 Endpoints

### ➕ Criar produto
**POST** `/produtos`

```json
{
  "nome": "Produto Exemplo",
  "preco": 100.00,
  "status": "ATIVO"
}
```
## 📄 Listar produtos
GET `/produtos`

## 🔍 Buscar produto por ID
GET `produtos/{id}`

## ✏️ Atualizar preço do produto
PATCH `produtos/{id}/preco`
```json
{
  "preco": 120.00
}
```

## 🔄 Atualizar status do produto
PATCH ```produtos/{id}/status```
```json
{
  "status": "INATIVO"
}
```
## 🗄️ Banco de Dados H2
- Console: `http://localhost:8080/h2-console`

- JDBC URL: `jdbc:h2:mem:testdb`

- Usuário: `sa`

- Senha: (em branco)

## ▶️ Como executar o projeto

Certifique-se de ter o **Java** e o **Maven** instalados.

```bash
mvn spring-boot:run
```
A aplicação estará disponível em:
```bash
http://localhost:8080
```