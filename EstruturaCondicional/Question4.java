package EstruturaCondicional;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
        sc.close();
    }
}
