# 🔐 Spring Security JWT API

Utilizando **Spring Boot**, com autenticação via **JWT (JSON Web Token)** para controlar o acesso aos endpoints. Este projeto demonstra como proteger endpoints de forma segura utilizando **Spring Security** com JWT.

## 🚀 Tecnologias Utilizadas
- 🟦 **Spring Boot**
- 🌐 **Spring MVC**
- 🔒 **Spring Security**
- 🗄️ **Spring Data JDBC**
- 🗃️ **H2 Database**

## ⚙️ Como Executar o Projeto

1. **Clonar o repositório git:**
    ```bash
    git clone https://github.com/bfrjunior/spring-security-jwt.git
    ```

2. **Construir o projeto:**
    ```bash
    ./mvnw clean package
    ```

3. **Executar:**
    ```bash
    java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar
    ```

## 🧪 Como Testar a API

Para testar os endpoints, você pode utilizar o [HTTPie](https://httpie.io/) ou outra ferramenta de sua preferência.

1. **Autenticar e obter o token JWT:**
    ```bash
    http -a username:password POST :8080/authenticate
    ```

    O comando acima retorna um token JWT. Guarde-o para as requisições seguintes.

2. **Acessar um endpoint protegido com o token JWT:**
    ```bash
    JWT=<token>
    http :8080/private -A bearer -a ${JWT}
    ```
