package Metodos_Java;
import java.util.Scanner;


// codigo que verifica a media de notas
public class IfElse_MediaNotas02_Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

            double media = calcularMedia(nota1, nota2);
            verificarSituacao(media);

            sc.close();
        }

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
    }

