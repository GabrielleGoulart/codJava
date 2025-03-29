import java.util.Scanner;

public class CalculadoraFatorial_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro não negativo (máximo 20): ");
            int numero = sc.nextInt();

            if (numero < 0) {
                throw new NumeroNegativoException("Número negativo não é permitido.");
            }
            if (numero > 20) {
                throw new LimiteFatorialExcedidoException("Número maior que 20 excede o limite.");
            }

            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);

        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.err.println("Erro: " + e.getMessage());
            sc.close();
        }
    }

    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensagem) {
        super(mensagem);
    }
}

class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String mensagem) {
        super(mensagem);
    }
}