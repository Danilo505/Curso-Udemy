package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, vUni1, vUni2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        vUni1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        vUni2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * vUni1 + preco2 * vUni2;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        sc.close();

    }
}
