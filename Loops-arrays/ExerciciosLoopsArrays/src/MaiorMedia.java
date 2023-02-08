import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número e a média desses números.
public class MaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int count = 0;
        int soma = 0;
        int maior = 0;

        do {
            System.out.println("Insira um número: ");
            numero = scan.nextInt();
            count++;
            soma = soma + numero;
            if (numero > maior)
                maior = numero;

        } while (count < 5);

        System.out.println("Maior número é: " + maior);
        System.out.println("A média dos números é: " + soma / 5);

    }
}
