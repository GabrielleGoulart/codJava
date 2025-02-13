package MediaNotas_Metodos;

public class Object {

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void verificarSituacao(double media) {
        if (media >= 7) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media >= 5 && media <7) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado, que pena! A sua média é: " + media);
        }

    }

    // Método que recebe um valor inteiro e retorna uma string formatada
    public static String showResult(int value) {
        return "resultado: " + value;
    }
}

