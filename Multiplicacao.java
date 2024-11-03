public class Multiplicacao extends Operacao {

    private double calcularMultiplicacao() {
        return num1 * num2;
    }

    @Override
    public double calcular() {
        return calcularMultiplicacao();
    }
}
