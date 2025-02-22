# Amigo Secreto em Java

Este é um programa simples em Java que permite ao usuário organizar um sorteio de amigo secreto. O programa solicita o número de participantes, coleta os nomes dos amigos e, em seguida, sorteia um amigo secreto aleatoriamente.

---

## Funcionalidades

1. **Validação de Entrada**:
   - O programa verifica se o número de participantes é um número inteiro válido.
   - Verifica se os nomes dos participantes não estão vazios.

2. **Sorteio Aleatório**:
   - Usa a classe `Random` do Java para sortear um amigo secreto de forma justa e aleatória.

3. **Interface Simples**:
   - Mensagens claras e instruções passo a passo para o usuário.

---

## Como Executar

### Pré-requisitos

- **Java Development Kit (JDK)**: Certifique-se de ter o JDK instalado na sua máquina. Você pode verificar isso executando o comando:
  ```bash
  java -version
  ```
  Se não tiver o JDK instalado, você pode baixá-lo [aqui](https://www.oracle.com/java/technologies/javase-downloads.html).

- **Ambiente de Desenvolvimento**: Você pode usar qualquer IDE (como IntelliJ, Eclipse ou VS Code) ou compilar e executar o código diretamente pelo terminal.

---

### Passos para Executar

1. **Clone o Repositório** (se aplicável):
   ```bash
   git clone https://github.com/newtsarthur/trilha-java-basico.git
   cd amigo-secreto-java
   ```

2. **Compile o Código**:
   - Navegue até o diretório onde o arquivo `Embaralhar.java` está localizado e execute:
     ```bash
     javac Embaralhar.java
     ```

3. **Execute o Programa**:
   - Após compilar, execute o programa com o comando:
     ```bash
     java Embaralhar
     ```

4. **Siga as Instruções**:
   - Digite o número de participantes.
   - Insira os nomes dos amigos.
   - O programa sorteará e exibirá o amigo secreto.

---

## Exemplo de Uso

### Entrada:
```
Digite o total de amigos que você quer sortear: 3
Digite o nome que você quer adicionar à lista de amigos sorteados: João
Digite o nome que você quer adicionar à lista de amigos sorteados: Maria
Digite o nome que você quer adicionar à lista de amigos sorteados: Pedro
```

### Saída:
```
Irei sortear os nomes: João, Maria, Pedro
Sorteando...
Parabéns, seu amigo secreto é: Maria!
```

---

## Estrutura do Código

- **Classe Principal**: `Embaralhar`
  - Contém o método `main`, que gerencia a interação com o usuário e o sorteio.
- **Bibliotecas Utilizadas**:
  - `java.util.Scanner`: Para capturar entradas do usuário.
  - `java.util.Random`: Para gerar números aleatórios.

---

## Melhorias Futuras

1. **Validação de Texto**:
   - Garantir que os nomes contenham apenas letras e espaços.

2. **Repetição de Leitura**:
   - Permitir que o usuário corrija entradas inválidas sem reiniciar o programa.

3. **Interface Gráfica**:
   - Desenvolver uma interface gráfica simples usando Java Swing ou JavaFX.

4. **Exportação de Resultados**:
   - Salvar a lista de participantes e o resultado do sorteio em um arquivo de texto.

---

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções ou novas funcionalidades.

---

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.