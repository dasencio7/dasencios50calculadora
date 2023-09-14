package modelo;

public class CalculadoraInteres {
    public static double calcularInteresSimple(double capital, double tasa, int años) {
        return capital * (tasa / 100) * años;
    }
}
