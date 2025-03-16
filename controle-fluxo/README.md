# Contador de Números

Este é um simples programa Java que solicita dois parâmetros ao usuário e realiza uma contagem progressiva a partir do primeiro parâmetro até o segundo parâmetro.

## Como Funciona

1. O programa solicita ao usuário que insira dois números inteiros:
   - O primeiro parâmetro é o número inicial da contagem.
   - O segundo parâmetro é o número final da contagem.

2. O programa verifica se o segundo parâmetro é maior que o primeiro. Caso contrário, uma exceção `ParametrosInvalidosExeption` é lançada.

3. Se os parâmetros forem válidos, o programa realiza a contagem progressiva e imprime cada número no console.

## Exemplo de Uso

```plaintext
Digite o primeiro parâmetro: 3
Digite o segundo parâmetro: 7
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

## Estrutura do Código

- **Contador.java**: Contém a classe principal `Contador` que gerencia a entrada do usuário e a lógica de contagem.
- **ParametrosInvalidosExeption.java**: Define uma exceção personalizada para tratar casos em que o segundo parâmetro não é maior que o primeiro.

## Como Executar

1. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
2. Compile o código-fonte usando o comando:
   ```bash
   javac Contador.java
   ```
3. Execute o programa com o comando:
   ```bash
   java Contador
   ```

## Requisitos

- Java JDK 8 ou superior.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorar o projeto.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.