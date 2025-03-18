import java.util.InputMismatchException;
import java.util.Scanner;

public class DepositoeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // Entrada das três transações
        for (int i = 0; i < 3; i++) {
            double transacao = scanner.nextDouble();
            saldoInicial += transacao; // Transações positivas são depósitos, negativas são saques
        }

        // Saída do saldo final
        System.out.printf("%.2f\n", saldoInicial);

        scanner.close();
    }
}
