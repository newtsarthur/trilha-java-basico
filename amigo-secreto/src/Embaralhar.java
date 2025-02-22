import java.util.Scanner;
public class Embaralhar {
  public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o total de amigos que você quer sortear: ");
    int total = ler.nextInt();

    String amigosTotal[];

    try {
      for(int x = 0; x <= total; x++)
      {
        System.out.println("Digite o nome que você quer adicionar a lista de amigos sorteados: ");
        String amigos = ler.nextLine();
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.print("Erro ");
    }
  }
}
