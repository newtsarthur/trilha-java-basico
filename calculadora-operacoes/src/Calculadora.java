import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite um valor: ");
    double numOne = ler.nextDouble();

    System.out.print("Digite mais um valor: ");
    double numTwo = ler.nextDouble();

    System.out.print("Digite o número referente a operação que você quer realizar: 1: Somar, 2: Subtrair, 3: Multiplicar, 4: Dividir: ");
    int operacao = ler.nextInt();

    double resultado = 0;

    if(operacao == 1)
    {
      resultado = (numOne + numTwo);
      System.out.println("A soma dos valores deu: " + resultado);
    }
    if(operacao == 2) 
    {
      resultado = (numOne - numTwo);
      System.out.println("A subtração dos valores deu: " + resultado);
    }
    if(operacao == 3)
    {
      resultado = (numOne * numTwo);
      System.out.println("A multiplicação dos valores deu: " + resultado);
    }
    if(operacao == 4)
    {
      resultado = (numOne / numTwo);
      System.out.println("A divisão dos valores deu: " + resultado);
    }
  }
}