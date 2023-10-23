package EstruturasRepetitivas;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Alcol = 0;
        int Gasolina = 0;
        int Diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                Alcol = Alcol + 1;
            } else if (tipo == 2) {
                Gasolina = Gasolina + 1;
            } else if (tipo == 3) {
                Diesel = Diesel + 1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + Alcol);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);
        sc.close();
    }
}
