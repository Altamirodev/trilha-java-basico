import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int fatorial;
        int resultado = 1;

        System.out.println("Insira o número que deseja ver fatorial: ");
        fatorial = scan.nextInt();
        System.out.print(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
        }
        System.out.println(" " + resultado);
    }
}