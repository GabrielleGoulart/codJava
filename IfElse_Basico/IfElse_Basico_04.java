package If_else;
import java.util.Scanner;

public class IfElse_Basico_04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o seu ano de nascimento: ");
            int anoNascimento = sc.nextInt();
            int anoAtual = 2025;
            int idade = anoAtual - anoNascimento;
            if (idade >= 16) {
                System.out.println("Você pode votar.");
                if (idade < 18) {
                    System.out.println("O voto não é obrigatório, mas pode votar.");
                } else if (idade <= 70) {
                    System.out.println("O voto é obrigatório.");
                } else {
                    System.out.println("Você ainda não pode votar.");
                }

                sc.close();
            }

        }
    }


