/***
 * Ler 3 números
 * Colocar em ordem crescente
 */

import java.util.Scanner;

public class Ex04{
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Valor 1: ");
        int numA = input.nextInt();

        System.out.print("Valor 2: ");
        int numB = input.nextInt();

        System.out.print("Valor 3: ");
        int numC = input.nextInt();

        // Colocando em ordem crescente
        int first = 0;
        int second = 0;
        int third = 0;

        if (numA < numB && numA < numC){
            first = numA;
            if (numB < numC){
                second = numB;
                third = numC;
            } else {
                second = numC;
                third = numB;
            }
        } else if (numB < numC && numB < numA){
            first = numB;
            if (numA < numC){
                second = numA;
                third = numC;
            } else {
                second = numC;
                third = numA;
            }
        } else {
            first = numC;
            if (numA < numB) {
                second = numA;
                third = numB;
            } else {
                second = numB;
                third = numA;
            }
        }
        System.out.print(first + ", " + second + ", " + third);
    }
}