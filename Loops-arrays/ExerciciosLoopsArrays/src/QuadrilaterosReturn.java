// Neste exemplo, utilizamos SOBRECARGA no MÉTODO, mas com o RETURN. Isso permite ARMAZENAR o seu resultado
// em variáveis, no momento em que CHAMAMOS o MÉTODO (na classe METODOS.JAVA).

public class QuadrilaterosReturn {
    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
