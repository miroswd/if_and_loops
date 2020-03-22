/***
 * Entrar com 2 números
 * mostrar o maior numero
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int valueA = input.nextInt();

        System.out.print("Valor 2: ");
        int valueB = input.nextInt();

        if (valueA > valueB){
            System.out.println(valueA + " é maior");
        } else if (valueA < valueB) {
            System.out.println(valueB + " é maior");
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}
