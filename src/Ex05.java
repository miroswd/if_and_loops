/***
 * Inserir um número
 * Indicar se está entre 20 e 90
 */


import java.util.Scanner;


public class Ex05 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre 20 e 90: ");
        int num = input.nextInt();

        if (num > 20 && num < 90){
            System.out.println("O número está indicado no intervalo correspondido");
        } else {
            System.out.println("O número não está indicado no intervalo correspondido");
        }


    }
}
