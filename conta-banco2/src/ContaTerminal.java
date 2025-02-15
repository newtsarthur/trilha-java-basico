import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {

    //TODO: Conhecer e importar a classe Scanner
    Scanner scanner = new Scanner(System.in);

    double saldo = 237.48;

    System.out.println("Seja bem vindo ao nosso aplicativo! Ao criar sua conta, você receberá um saldo de R$" + saldo + "!");

    //Exibir pelo scanner os valores digitados no terminal
    System.out.print("Por favor, digite seu primeiro nome: ");
    String firstName = scanner.nextLine();

    System.out.print("Agora digite seu sobrenome: ");
    String lastName = scanner.nextLine();

    System.out.print("Por gentileza, digite o número da Agência: ");
    String agencia = scanner.nextLine();

    System.out.print("digite os números da sua conta: ");
    int numero = scanner.nextInt();

    //Exibir a mensagem criada
    System.out.println("Olá! " + firstName + ", obrigado por criar uma conta em nosso banco, sua agência é "
    + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível!");
  }
}