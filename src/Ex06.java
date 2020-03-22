/***
 * Input de um número
 * Exibir uma das msgs -> Maior, igual ou menor a 20
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if ( num < 20){
            System.out.println(num + " é menor que 20");
        } else if (num > 20){
            System.out.println(num + " é maior que 20");
        } else {
            System.out.println(num + " é igual a 20");
        }
    }
}
