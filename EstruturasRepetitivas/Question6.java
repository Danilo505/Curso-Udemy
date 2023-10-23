package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp;
        do {
            System.out.print("Digite a temperatuda em Celsius");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", F);
            System.out.print("Deseja continuar? s/n?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}
