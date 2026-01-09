# Produto API

API REST desenvolvida em Spring Boot para gerenciamento de produtos, permitindo cadastro e listagem de produtos com cálculo do valor total em estoque.

O projeto foi criado com foco em boas práticas de arquitetura em camadas (Controller, Service, Repository) e exposição de endpoints RESTful.

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
- Calcular valor total do estoque por produto (preço × quantidade)

---

## 🔗 Endpoints

### ➕ Criar produto
**POST** `/produtos`

```json
{
  "nome": "Produto Exemplo",
  "preco": 100.00,
  "quantidade": 5
}
```
## 📄 Listar produtos
GET `/produtos`
```json
{
  "nome": "Produto Exemplo",
  "preco": 100.00,
  "quantidade": 5,
  "valorEstoque": 500.00
}
```
O campo `valorEstoque` é calculado pela aplicação no momento da listagem.

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