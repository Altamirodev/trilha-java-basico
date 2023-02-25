//Calcular a área do Quadrado, retângulo, Trapézio e Losango, utilizando SOBRECARGA no MÉTODO
//SOBRECARGA é a utilização do mesmo NOME do método, com LISTA DE PARÂMETROS DIFERENTES
//Isso permite a utilização de um mesmo método para mais de um cenário.

public class Quadrilateros {
    public static void area(double lado) {
        System.out.println("A área do Quadrado é: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A área do Quadrado é: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do Quadrado é: " + ((baseMaior + baseMenor) * altura));
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A área do Losango é: " + (diagonal1 * diagonal2) / 2);
    }
}
