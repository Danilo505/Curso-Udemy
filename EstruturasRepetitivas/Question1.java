package EstruturasRepetitivas;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");

        int senha = sc.nextInt();
        while (senha != 2020){
            System.out.println("Senha invalida!");
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
