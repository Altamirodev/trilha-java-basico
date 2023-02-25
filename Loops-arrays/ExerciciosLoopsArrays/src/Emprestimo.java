/*Calcular o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas 
influenciam nos valores (posso definir a meu critério) */

public class Emprestimo {

    public static void financiamento(int parcelas, double valorSolicitado) {
        double resultado = 0;
        double taxa = 0;

        if (parcelas > 0 | parcelas < 6) {
            taxa = 0.15;
            resultado = ((valorSolicitado * taxa) + valorSolicitado);
            System.out.println("A taxa do empréstimo é de : " + taxa + "%");
            System.out.println("O valor final do emprestimo é de : " + resultado);
        }

        else if (parcelas > 5 | parcelas < 11) {
            taxa = 0.30;
            resultado = ((valorSolicitado * taxa) + valorSolicitado);
            System.out.println("A taxa do empréstimo é de : " + taxa + "%");
            System.out.println("O valor final do emprestimo é de : " + resultado);
        } else {
            System.out.println("Número de parcelas inválido!");
        }
    }
}
