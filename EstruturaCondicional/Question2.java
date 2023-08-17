package EstruturaCondicional;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }
            sc.close();
    }
}
