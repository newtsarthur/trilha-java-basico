# Contador de Números

Este é um projeto simples em Java que solicita dois números ao usuário e imprime uma contagem dos números entre eles. Se o segundo número for menor ou igual ao primeiro, o programa lança uma exceção personalizada.

## Funcionalidades

- Solicita dois números ao usuário.
- Verifica se o segundo número é maior que o primeiro.
- Se válido, imprime os números no intervalo entre os dois números.
- Se inválido, lança uma exceção personalizada com uma mensagem de erro.

## Como Executar

### Pré-requisitos

- Java Development Kit (JDK) instalado (versão 8 ou superior).
- Um terminal ou IDE para compilar e executar o código.

### Passos

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/newtsarthur/trilha-java-basico.git
   cd controle-fluxo
   ```

2. **Compile o código:**

   No terminal, navegue até o diretório do projeto e execute o seguinte comando para compilar o código:

   ```bash
   javac Contador.java
   ```

3. **Execute o programa:**

   Após compilar, execute o programa com o seguinte comando:

   ```bash
   java Contador
   ```

4. **Siga as instruções:**

   - Digite o primeiro parâmetro (número inteiro).
   - Digite o segundo parâmetro (número inteiro).
   - O programa imprimirá os números no intervalo ou exibirá uma mensagem de erro se o segundo parâmetro for menor ou igual ao primeiro.

### Exemplo de Execução

#### Caso 1: Parâmetros válidos

```
Digite o primeiro parâmetro: 3
Digite o segundo parâmetro: 7
Imprimindo o número 4
Imprimindo o número 5
Imprimindo o número 6
Imprimindo o número 7
```

#### Caso 2: Parâmetros inválidos

```
Digite o primeiro parâmetro: 10
Digite o segundo parâmetro: 5
Erro! O segundo parâmetro deve ser maior que o primeiro parâmetro
```

## Estrutura do Código

- **`Contador.java`**: Contém a lógica principal do programa, incluindo a leitura dos parâmetros, validação e contagem.
- **`ParametrosInvalidosExeption.java`**: Define uma exceção personalizada para tratar casos em que o segundo parâmetro é menor ou igual ao primeiro.

## Exceção Personalizada

A exceção `ParametrosInvalidosExeption` é lançada quando o segundo parâmetro é menor ou igual ao primeiro. Ela estende a classe `Exception` e permite a criação de mensagens de erro personalizadas.

```java
class ParametrosInvalidosExeption extends Exception {
  public ParametrosInvalidosExeption(String mensagem) {
    super(mensagem);
  }
}
```

## Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este projeto, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.