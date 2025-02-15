import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    //TODO: Conhecer e importar a classe Scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Seja bem vindo ao nosso aplicativo!");

    System.out.print("Olá! Por favor, digite seu primeiro nome: ");
    String firstName = scanner.nextLine();

    System.out.print("Agora digite seu sobrenome: ");
    String lastName = scanner.nextLine();

    System.out.print("Por gentileza, digite o número da Agência: ");
    String agencia = scanner.nextLine();

    System.out.print("Agora, digite os números da sua conta: ");
    int numero = scanner.nextInt();


    //Exibir pelo scanner os valores digitados no terminal

    //Exibir a mensagem criada
}
}