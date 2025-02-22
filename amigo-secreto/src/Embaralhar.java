import java.util.Random;
import java.util.Scanner;

public class Embaralhar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Random random = new Random();

    int total = 0;

    boolean numberInt = false;

    while(!numberInt)
    {
      try {
        System.out.print("Digite o total de amigos que você quer sortear: ");
        total = ler.nextInt();
        ler.nextLine();
        numberInt = true;
      } catch (Exception e) {
        System.out.println("Por favor digite um número inteiro para continuar! ");
        ler.nextLine();
      }
    }

    if(total != 0)
    {
      String[] amigosTotal = new String[total];

      try {
        for(int x = 0; x < total; x++)
        {
          System.out.print("Digite o nome que você quer adicionar a lista de amigos sorteados: ");
          String amigos = ler.nextLine();
  
          if(amigos.isEmpty())
          {
            throw new Exception("O nome não pode ser vazio! Tente novamente!");
          }
  
          amigosTotal[x] = amigos;
  
        }
      } catch (Exception e) {
        System.out.print("Erro! " + e.getMessage());
      }
  
      System.out.print("Irei sortear os nomes: ");
  
      for(int i = 0; i < amigosTotal.length; i++)
      {
        System.out.print(amigosTotal[i]);
  
        if(i < amigosTotal.length - 1)
        {
          System.out.print(", ");
        }
      }
      System.out.println(" ");
  
      System.out.println("Sorteando...");
  
      int amigoSecreto = random.nextInt(amigosTotal.length);
  
      System.out.print("Parabéns seu amigo secreto é: " + amigosTotal[amigoSecreto] + "!");
    }
  }
}