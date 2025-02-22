import java.util.Scanner;
public class Embaralhar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o total de amigos que você quer sortear: ");
    int total = ler.nextInt();

    String[] amigosTotal = new String[total];

    try {
      for(int x = 0; x <= total; x++)
      {
        System.out.print("Digite o nome que você quer adicionar a lista de amigos sorteados: ");
        String amigos = ler.nextLine();

        amigosTotal[x] = amigos;

        System.out.println(amigosTotal);
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.print("Erro");
    }
  }
}
