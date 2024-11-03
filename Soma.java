public class Soma extends Operacao {

    private double calcularSoma() {
        return num1 + num2;
    }

    @Override
    public double calcular() {
        return calcularSoma();
    }
}
