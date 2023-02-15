/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; */

import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Insira uma nota entre 0 e 10 :");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida, por favor insira uma nota válida: ");
            nota = scan.nextInt();

        }
    }
}