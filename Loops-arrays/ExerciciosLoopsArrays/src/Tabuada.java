import java.util.Scanner;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
//O usuário deve informar de qual numero ele deseja ver a tabuada
public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        System.out.println("Insira o número que deseja ver a tabuada: ");
        numero = scan.nextInt();
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

    }

}
