import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.print("Digite o primeiro parâmetro: ");
    int parametroOne = terminal.nextInt();

    System.out.print("Digite o segundo parâmetro: ");
    int parametroTwo = terminal.nextInt();

    try {
      contar(parametroOne, parametroTwo);
    } catch (ParametrosInvalidosExeption e) {
      System.out.println("Erro!" + e.getMessage());
    } finally {
      terminal.close();
    }
  } 

  static void contar(int parametroOne, int parametroTwo) throws ParametrosInvalidosExeption {
    if(parametroOne >= parametroTwo) {
      throw new ParametrosInvalidosExeption("O segundo parâmetro deve ser maior que o primeiro parâmetro");
    }
    int contagem = parametroTwo - parametroOne;

    for(int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + (i));
    }
  }
}
class ParametrosInvalidosExeption extends Exception {
  public ParametrosInvalidosExeption(String mensagem)
  {
    super(mensagem);
  }
}
