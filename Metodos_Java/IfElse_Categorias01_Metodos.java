package Metodos_Java;
import java.util.Scanner;


//Codigo que verifica em que classificação sua idade pertence
public class IfElse_Categorias01_Metodos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int idade = Idade(sc);
            verificarCategoria(idade);

            sc.close();
        }

        public static int Idade(Scanner sc) {
            System.out.print("Digite a sua idade: ");
            return sc.nextInt();
        }

        public static void verificarCategoria(int idade) {
            if (idade >= 0 && idade <= 11) {
                System.out.println("Criança");
            } else if (idade >= 12 && idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade >= 18 && idade <= 59) {
                System.out.println("Adulto");
            } else if (idade >= 60) {
                System.out.println("Idoso");
            }
        }
    }


