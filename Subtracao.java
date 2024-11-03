public class Subtracao extends Operacao {

    private double calcularSubtracao() {
        return num1 - num2;
    }

    @Override
    public double calcular() {
        return calcularSubtracao();
    }
}
