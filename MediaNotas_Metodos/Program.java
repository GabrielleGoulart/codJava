package MediaNotas_Metodos;
import java.util.Scanner;

import static MediaNotas_Metodos.Object.calcularMedia;
import static MediaNotas_Metodos.Object.verificarSituacao;

public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            double media = calcularMedia(nota1, nota2);
            verificarSituacao(media);

            int higher = 0;
            Object.showResult(higher);

            System.out.println(higher);
            sc.close();
        }
    }
