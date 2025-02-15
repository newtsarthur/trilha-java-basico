# ContaTerminal - Desafio Trilha Java Básico DIO

Este projeto é parte do desafio **Trilha Java Básico** da [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo é criar uma aplicação simples em Java que simula a criação de uma conta bancária, interagindo com o usuário via terminal.

---

## 🚀 Descrição do Projeto

O programa **ContaTerminal** solicita ao usuário que insira algumas informações pessoais, como nome, sobrenome, número da agência e número da conta. Em seguida, ele exibe uma mensagem de boas-vindas com os detalhes da conta e um saldo inicial pré-definido.

---

## 📋 Funcionalidades

- **Entrada de dados via terminal**: O programa utiliza a classe `Scanner` para capturar as informações do usuário.
- **Exibição de mensagem personalizada**: Após coletar os dados, o programa exibe uma mensagem de boas-vindas com os detalhes da conta.
- **Saldo inicial**: O saldo inicial da conta é definido como R$ 237,48.

---

## 🛠️ Como Executar o Projeto

### Pré-requisitos
- Java Development Kit (JDK) instalado (versão 8 ou superior).
- Um ambiente de desenvolvimento (IDE) como Visual Studio Code, IntelliJ IDEA ou Eclipse.

### Passos para Execução

1. **Clone o repositório** (se aplicável):
   ```bash
   git clone https://github.com/seu-usuario/conta-terminal-dio.git
   cd conta-terminal-dio
   ```

2. **Compile o código**:
   No terminal, navegue até a pasta do projeto e compile o arquivo `ContaTerminal.java`:
   ```bash
   javac src/ContaTerminal.java
   ```

3. **Execute o programa**:
   Após compilar, execute o programa com o seguinte comando:
   ```bash
   java src/ContaTerminal
   ```

4. **Interaja com o programa**:
   - Insira seu primeiro nome, sobrenome, número da agência e número da conta quando solicitado.
   - O programa exibirá uma mensagem de boas-vindas com os detalhes da conta.

---

## 📝 Exemplo de Uso

Aqui está um exemplo de como o programa funciona:

```
Seja bem vindo ao nosso aplicativo! Ao criar sua conta, você receberá um saldo de R$237.48!
Por favor, digite seu primeiro nome: João
Agora digite seu sobrenome: Silva
Por gentileza, digite o número da Agência: 123-4
Digite os números da sua conta: 5678

Olá! João, obrigado por criar uma conta em nosso banco, sua agência é 123-4, conta 5678 e seu saldo de R$237.48 já está disponível!
```

---

## 🧩 Estrutura do Projeto

O projeto possui a seguinte estrutura:

```
conta-terminal-dio/
└── src/
    └── ContaTerminal.java
```

- **`ContaTerminal.java`**: Contém o código principal do programa.

---

## 🛑 Possíveis Erros e Soluções

1. **Erro: "The declared package does not match the expected package"**:
   - Certifique-se de que o arquivo `ContaTerminal.java` está dentro da pasta `src` e que a declaração do pacote no código está correta (`package src;`).

2. **Erro: "Could not find or load main class"**:
   - Verifique se o arquivo foi compilado corretamente e se o comando de execução está apontando para o caminho certo.

3. **Erro ao inserir dados**:
   - Certifique-se de inserir os dados no formato correto (por exemplo, números para a conta e texto para o nome).

---

## 📚 Aprendizados

Este projeto ajudou a praticar:
- Uso da classe `Scanner` para entrada de dados.
- Manipulação de strings e exibição de mensagens formatadas.
- Estrutura básica de um programa Java.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este projeto, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

---

## 🙏 Agradecimentos

- À [Digital Innovation One (DIO)](https://www.dio.me/) por proporcionar este desafio e incentivar o aprendizado de Java.

---

Se tiver dúvidas ou sugestões, sinta-se à vontade para entrar em contato! 😊

---