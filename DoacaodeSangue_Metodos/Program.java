package DoacaodeSangue_Metodos;
import java.util.Scanner;
import static DoacaodeSangue_Metodos.Object.verificarDoacao;

// codigo que verifica idade e peso para doação de sangue
public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int idade = pedirIdade(sc);
            double peso = pedirPeso(sc);

            verificarDoacao(idade, peso);

            sc.close();
        }

        public static int pedirIdade(Scanner sc) {
            System.out.print("Digite sua idade: ");
            return sc.nextInt();
        }

        public static double pedirPeso(Scanner sc) {
            System.out.print("Digite seu peso: ");
            return sc.nextDouble();
        }
}
