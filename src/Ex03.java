/***
 * Input de número
 * Raiz quadrada
 */


import java.util.Scanner;

public class Ex03 {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        double squareRoot = Math.sqrt(num);
        String result = String.format("%.2f", squareRoot); // Não é possível que seja desse jeito a formatação
        System.out.println("A raiz quadrada: " + result);
    }
}
