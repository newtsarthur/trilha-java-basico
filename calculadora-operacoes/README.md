# Calculadora Simples em Java

Este é um projeto simples de uma calculadora em Java que realiza operações básicas como soma, subtração, multiplicação e divisão. O projeto foi desenvolvido para iniciantes em Java, com o objetivo de praticar conceitos básicos como entrada/saída, estruturas condicionais e tratamento de exceções.

## Funcionalidades

- Realiza as quatro operações básicas:
  - Soma (`+`)
  - Subtração (`-`)
  - Multiplicação (`*`)
  - Divisão (`/`)
- Interface simples via terminal.

## Como Executar o Projeto

### Pré-requisitos

- Java Development Kit (JDK) instalado (versão 8 ou superior).
- Um terminal ou IDE para compilar e executar o código.

### Passos para Execução

1. Clone o repositório ou copie o código para o seu ambiente de desenvolvimento.
2. Abra o terminal na pasta onde o arquivo `Calculadora.java` está localizado.
3. Compile o código usando o comando:
   ```bash
   javac Calculadora.java
   ```
4. Execute o programa com o comando:
   ```bash
   java Calculadora
   ```
5. Siga as instruções exibidas no terminal para inserir os números e escolher a operação.

### Exemplo de Uso

```
Digite o primeiro número: 10
Digite o segundo número: 5
Escolha a operação (+, -, *, /): *
Resultado: 50
```

## Estrutura do Código

- **Entrada de dados:** Utiliza a classe `Scanner` para receber entrada do usuário.
- **Operações:** Usa estruturas condicionais (`if`, `else`) para determinar a operação a ser realizada.
- **Tratamento de erros:** Verifica se o segundo número é zero no caso de divisão, evitando erros de divisão por zero.

## Melhorias Futuras

- Adicionar suporte para operações com mais de dois números.
- Implementar funcionalidades adicionais, como cálculo de potência ou raiz quadrada.
- Criar uma interface gráfica (GUI) para melhorar a experiência do usuário.

## Contribuição

Contribuições são bem-vindas! Se você quiser melhorar o projeto ou adicionar novas funcionalidades, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Faça push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.