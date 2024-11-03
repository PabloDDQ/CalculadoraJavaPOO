import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        Soma soma = new Soma();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        Subtracao subtracao = new Subtracao();
        Potenciacao potenciacao = new Potenciacao();

        do {
            String operador;
            while (true) { 
                System.out.print("Digite o operador +, -, /, * ou **: ");
                operador = scanner.nextLine();

                if (operador.equals("+") || operador.equals("-") || operador.equals("/") || operador.equals("*") || operador.equals("**")) {
                    break; 
                } else {
                    System.out.println("Operador inválido. Por favor, digite novamente.");
                }
            }

            System.out.println("O operador escolhido foi: " + operador);

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            if (operador.equals("+")) {
                soma.setNum1(num1);
                soma.setNum2(num2);
                resultado = soma.calcular();

            } else if (operador.equals("-")) {
                subtracao.setNum1(num1);
                subtracao.setNum2(num2);
                resultado = subtracao.calcular();

            } else if (operador.equals("*")) {
                multiplicacao.setNum1(num1);
                multiplicacao.setNum2(num2);
                resultado = multiplicacao.calcular();

            } else if (operador.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.nextLine(); 
                    continue; 
                }
                divisao.setNum1(num1);
                divisao.setNum2(num2);
                resultado = divisao.calcular();

            } else if (operador.equals("**")) {
                potenciacao.setNum1(num1);
                potenciacao.setNum2(num2);
                resultado = potenciacao.calcular();
            }

            System.out.println("O resultado é: " + resultado);

            System.out.print("Deseja realizar outra operação? (S/N): ");
            continuar = scanner.next(); 
            scanner.nextLine(); 

            if (continuar.equalsIgnoreCase("N")) {
                System.out.println("Programa encerrado.");
            }
        } while (continuar.equalsIgnoreCase("S"));

        scanner.close();
    }
}
