public class Potenciacao extends Operacao {

    private double calcularPotenciacao() {
        return Math.pow(num1, num2);
    }

    @Override
    public double calcular() {
        return calcularPotenciacao();
    }
}
