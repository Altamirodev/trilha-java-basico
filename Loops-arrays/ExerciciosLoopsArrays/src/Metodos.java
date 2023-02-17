/*criar aplicação que resolva:
1 - Calcular as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores
devem ser passados;
2 - A partir da hora do dia, infomar a mensagem adequada: Bom dia; Boa tarde ou Boa noite;
3 - Calcular o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas 
influenciam nos valores (posso definir a meu critério)*/
public class Metodos {
    public static void main(String[] args) {

        // Calculadora
        Calculadora.soma(5.0, 10.50);
        Calculadora.subtracao(10, 11);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(30, 6);
        System.out.println("\n");

        // Mensagem de Saudação
        Mensagem.mensagemSaudacao(10);
        System.out.println("\n");
        // Emprestimo

        Emprestimo.financiamento(5, 1000);
    }

}
