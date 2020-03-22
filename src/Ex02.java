/***
 * Ler 2 números
 * Se o resultado for maior q 20, subtrair 5
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int value1 = input.nextInt();

        System.out.print("Valor 2: ");
        int value2 = input.nextInt();

        int sum = value1 + value2;

        if (sum <= 20 ) sum -= 5;

        System.out.println(sum);

    }
}
