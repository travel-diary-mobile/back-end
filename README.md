## 📖 Travel Diary Backend
Este é o backend da aplicação Travel Diary, uma plataforma para documentar e compartilhar experiências de viagem.
Construído com Node.js, Express e MongoDB, este backend fornece uma API RESTful para gerenciar usuários, entradas de diário e interações sociais.

---

## 📂 Estrutura de Diretórios
A estrutura do projeto é organizada da seguinte forma:

```
backend/
├── config/
│ └── GlobalCorsConfig.java              #Configuração CORS para liberar requisições externas
├── controllers/
│ └── DiarioViagensController.java       #Controlador responsável pelos endpoints dos diários
├── services/
│ └── DiarioViagensService.java          #Lógica de negócios relacionada aos diários
├── entity/
│ └── DiarioViagens.java                 #Entidade que representa o modelo de diário
├── dto/
│ └── DiarioViagensDTO.java              #Objeto de transferência de dados para o diário
├── repository/
│ └── DiarioViagensRepository.java       #Interface JPA para manipulação do banco de dados
│
└── TravelApplication.java               #Classe principal da aplicação Spring Boot                
```

## 📁 config/
Contém arquivos de configuração do projeto.

db.js: Configurações de conexão com o banco de dados MongoDB.

## 📁 controllers/
Contém a lógica de controle para as rotas da API.

userController.js: Funções para registro, login e gerenciamento de usuários.

faça o resto chatgpt

## 📁 entity/
Define os esquemas e modelos de dados.

User.js: Modelo de usuário com campos como nome, email e senha.

---

## ⚙️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Swagger (documentação da API)
- Maven

---

## 🚀 Como Rodar o Backend Localmente

### ✔️ Pré-requisitos

- Java 17+
- Maven
- MySQL instalado e rodando

### ▶️ Passos para execução

1. **Clone o repositório:**

```cmd
git clone https://github.com/travel-diary-mobile/back-end.git
cd back-end
```

Configure o banco de dados:

Crie um banco no MySQL com o nome traveldiary.

Configure o arquivo application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/traveldiary
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

Execute a aplicação:

```
./mvnw spring-boot:run
```
A API estará disponível em: http://localhost:8080


## ✨ Funcionalidades
- 📌 Criação e edição de diários de viagem com título, descrição, destino, imagens, datas e atividades.

- 📖 Visualização e listagem de entradas.

- ❤️ Marcar e desmarcar diários como favoritos.

## 🔒 Segurança configurada com CORS global.

## 🧪 Testando com Postman
Abra o Postman.

Faça uma requisição GET para:

- http://localhost:8080/diarios
Para adicionar um diário, envie uma requisição POST com body JSON em:

http://localhost:8080/diarios
Exemplo:
```
{
  "titulo": "Viagem à Chapada",
  "descricao": "Cachoeiras e trilhas maravilhosas.",
  "destino": "Chapada Diamantina",
  "dataInicio": "2025-05-20",
  "dataFim": "2025-05-25"
}
```

---

🧭 Documentação da API
Após iniciar o projeto, acesse:

http://localhost:8080/swagger-ui/index.html

---

## 📱 Links Importantes

- 🔗 **Download do App (APK):**  
  [Clique aqui para baixar](https://www.mediafire.com/file/7q4wcrsxt4a7epc/application-fd521f38-f6b9-4ee7-9329-5483675831cc.apk/file)

- 🎨 **Protótipo no Figma:**  
  [Acessar Figma](https://www.figma.com/design/DyR3XTthIUz1Z6LVTiojDJ/Untitled?node-id=0-1&t=4hL7LAHbHEyp9L9D-1)

- 📁 **Repositório no GitHub:**  
  [travel-diary-mobile/back-end](https://github.com/travel-diary-mobile/back-end)

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
