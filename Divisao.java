public class Divisao extends Operacao {

    private double calcularDivisao() {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    @Override
    public double calcular() {
        return calcularDivisao();
    }
}
