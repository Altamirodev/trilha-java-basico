import java.util.Scanner;

//Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade 
//de números impares.

public class ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int pares = 0, impares = 0;
        int quantNumeros;
        int count = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();
        do {

            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                pares++;
            else
                impares++;

            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de pares foi: " + pares);
        System.out.println("Quantidade de impares foi: " + impares);

    }

}
