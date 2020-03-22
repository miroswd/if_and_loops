/***
 * verificar se é múltiplo de 3
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if ( num % 3 == 0) {
            System.out.println("Múltiplo de 3");
        } else {
            System.out.println("Não é múltiplo de 3");
        }
    }
}
