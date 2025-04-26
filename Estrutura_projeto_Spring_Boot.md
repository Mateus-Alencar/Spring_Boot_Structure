
# Estrutura de Projeto Spring Boot

## 📁 src/main/resources/ — Recursos e Configuração

### `application.properties` ou `application.yml`

Arquivos de configuração do Spring Boot. Aqui você pode definir propriedades como porta do servidor, configurações de banco de dados, parâmetros de segurança, etc.

**Exemplo de configuração:**

```properties
server.port=8081
spring.datasource.url=jdbc:mysql://localhost:3306/meubanco
spring.datasource.username=usuario
spring.datasource.password=senha
```

### `static/`

Contém os arquivos estáticos (CSS, JS, imagens, fontes, etc.). Eles são servidos diretamente pelo servidor.

### `templates/`

Contém arquivos HTML dinâmicos que o Spring Boot renderiza (usando o Thymeleaf, por padrão). Aqui ficam os arquivos de frontend que são manipulados pelo backend, com dados inseridos a partir dos controladores.

---

## 📂 src/main/java/ — Código Fonte

Esta pasta contém o código Java do seu projeto. É aqui que você coloca todas as suas classes, como controladores, serviços e repositórios.

### `DemoApplication.java`

Classe principal que contém o método `main`, responsável por inicializar a aplicação Spring Boot.

### `controllers/`

**Controladores:** Onde você define os endpoints da API (usando `@RestController` ou `@Controller`). Os controladores recebem as requisições e interagem com os serviços para retornar respostas.

### `services/`

**Serviços:** Contém a lógica de negócio. Classes que fazem a interação com o banco de dados, regras de negócio, processamento de dados, etc.

### `repositories/`

**Repositórios:** Usados para interagir com o banco de dados. Geralmente estendem as interfaces do Spring Data JPA, como `JpaRepository` ou `CrudRepository`.

---

## 📄 `pom.xml` ou `build.gradle` — Gerenciamento de Dependências

Esses arquivos não ficam dentro do diretório `src`, mas são extremamente importantes no nível do projeto.

### `pom.xml` (Maven)

Arquivo de configuração do Maven. Define as dependências e plugins necessários para compilar, testar e empacotar sua aplicação.

### `build.gradle` (Gradle)

Arquivo de configuração do Gradle. Similar ao `pom.xml`, mas usando a sintaxe do Gradle.

---

## 🧩 Outros Arquivos Importantes

### `target/` ou `build/`

Essa pasta é gerada automaticamente durante a compilação do projeto. Ela contém os arquivos compilados (como o arquivo `.jar` ou `.war` que você vai rodar em produção).
