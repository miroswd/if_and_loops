/***
 * verificar se é divisível por 5
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if ( num % 5 == 0) {
            System.out.println("Divisível por 5");
        } else {
            System.out.println("Não é Divisível de 5");
        }
    }
}
