// CLASSE GERAL para executar MÉTODOS COM SET e GET, com SOBERCARGA, POLIMORFISMO, HERANÇA e SOBRESCRITA
//
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

        Emprestimo.financiamento(7, 1000);

        // Área dos quadriláterios SEM RETURN
        Quadrilateros.area(5d);
        Quadrilateros.area(5d, 5d);
        Quadrilateros.area(5d, 5d, 5d);
        Quadrilateros.area(5f, 5f);

        // Área dos quadriláterios com RETURN
        System.out.println("Exercícios Return: ");
        double areaQuadrado = QuadrilaterosReturn.area(5d);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        double areaRetangulo = QuadrilaterosReturn.area(5d, 5d);
        System.out.println("A área do Retângulo é: " + areaRetangulo);
        double areaTrapezio = QuadrilaterosReturn.area(5d, 5d, 5d);
        System.out.println("A área do Trapézio é: " + areaRetangulo);
        float areaLosango = QuadrilaterosReturn.area(5f, 5f);
        System.out.println("A área do Losango é: " + areaLosango);

        // Execução da classe CARRO:
        // Abaixo, INSTANCIAMOS um OBJETO e vincula/armazena os atributos à variável
        // carro1
        // Forma de INSTANCIAR sem passar parâmetro no CONSTRUTOR
        Carro carro1 = new Carro();
        carro1.setCor("Vermelho");
        carro1.setModelo("Uno Turbo 1994");
        carro1.setCapacidadeTanque(40);

        // SOUT para exibição dos valores com o método GET:
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.ValorTotalTanque(4.5));

        // Forma de INSTANCIAR passaNDO parâmetro no CONSTRUTOR
        Carro carro2 = new Carro("Vermelho", "Uno Turbo 1994", 40);

        // SOUT para exibição dos valores com o método GET:
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.ValorTotalTanque(4.5));

    }

}
