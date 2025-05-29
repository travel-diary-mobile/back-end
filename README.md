# 📖 Travel Diary Mobile – Front-end

Este é o repositório do front-end do aplicativo **Travel Diary Mobile**, uma aplicação que permite aos usuários registrar e compartilhar suas experiências de viagem de forma rápida, intuitiva e envolvente.

- **Link para baixar o app:**

   ```bash
   https://www.mediafire.com/file/7q4wcrsxt4a7epc/application-fd521f38-f6b9-4ee7-9329-5483675831cc.apk/file

)
   
- **Link do figma:**

   ```bash
   https://www.figma.com/design/DyR3XTthIUz1Z6LVTiojDJ/Untitled?node-id=0-1&t=4hL7LAHbHEyp9L9D-1
   
## ✨ Funcionalidades

-  Criação de diários de viagem com título, descrição, destino, imagens, datas e atividades realizadas.
-  Visualização e gerenciamento de entradas de diário.
-  Gerenciamento de diarios favoritos.

## 🛠️ Tecnologias Utilizadas

- **React Native**: Desenvolvimento de aplicações móveis multiplataforma.
- **JavaScript**: Linguagem principal para lógica de programação.
- **Expo**: Plataforma para facilitar o desenvolvimento e testes.
- **React Navigation**: Gerenciamento de navegação entre telas.
- **Axios**: Comunicação com APIs externas.
- **Context API**: Gerenciamento de estado global da aplicação.

## 🚀 Instalação e Execução

```bash
   git clone https://github.com/travel-diary-mobile/Front-end.git
   cd Front-end
   npm install
   npx expo start
```

## 📁 Estrutura de pasta

```
   Front-end/
   ├── assets/             # Recursos estáticos como imagens e fontes
   ├── components/         # Componentes reutilizáveis da interface
   ├── context/            # Gerenciamento de rotas do Back-end
   ├── navigation/         # Configuração de rotas e navegação
   └── pages/            # Telas principais da aplicação
      └── Splash/
      └── Inical/
      └── Adicionar/
      └── Editar/
      └── Deletar/
      └── Favoritar/
      └── Visualizar/
   └──  services/           # Serviços para comunicação com APIs
      └── Visualizar/
   ├── App.js              # Arquivo principal da aplicação
   └── package.json        # Dependências e scripts do projeto
```
