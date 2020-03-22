/***
 *  Ler 2 valores inteiros
 *  Somar os valores, se for maior que 10, exibir na tela
 * */

import java.util.Scanner;

public class Ex01{
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int value1 = input.nextInt();

        System.out.print("Digite o valor 2: ");
        int value2 = input.nextInt();

        int sum = value1 + value2;

        if (sum > 10) System.out.println("O valor da soma é " + sum);

    }
}