/***
 * Inputs = nome,sexo,idade
 * se sexo for feminino e idade menor que 25, imprimir "ACEITA"
 * caso contrário, nome + "NÃO ACEITA"
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = input.next();

        System.out.print("Sexo [F/M]: ");
        String gender = input.next().toUpperCase();

        System.out.print("Idade: ");
        int age = input.nextInt();

        if (gender.equals("F") && age < 25) {
            System.out.println("ACEITA");
        } else {
            System.out.println(name + " NÃO ACEITA");
        }
    }
}
