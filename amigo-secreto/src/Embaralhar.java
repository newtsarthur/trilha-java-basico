import java.util.Scanner;
public class Embaralhar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite o total de amigos que você quer sortear: ");
    int total = ler.nextInt();
    ler.nextLine();

    String[] amigosTotal = new String[total];

    try {
      for(int x = 0; x < total; x++)
      {
        System.out.print("Digite o nome que você quer adicionar a lista de amigos sorteados: ");
        String amigos = ler.nextLine();
        amigosTotal[x] = amigos;

      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.print("Erro");
    }

    System.out.print("Irei sortear os nomes: ");
    for(int i = 0; i < amigosTotal.length; i++)
    {
      System.out.print(amigosTotal[i] + ", ");
    }
  }
}
