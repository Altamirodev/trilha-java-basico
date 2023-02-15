// crie um vetor de 6 elementos para serem apresentados na ordem inversa.
public class Vetor {

    public static void main(String[] args) {

        int[] vetor = { 18, 92, -35, 8, 19, 7 };

        // System.out.println(vetor.length);
        // Aqui apresenta o TAMANHO do vetor (quantas posições existem)
        int count = 0;
        System.out.print("Vetor: ");
        // Apresentar Vetor na ordem normal:
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        // Abaixo a lógica no laco FOR para impressão na ORDEM INVERSA
        System.out.print("\nVetor: "); // o código "\n" serve para pular uma linha na impressão.
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
