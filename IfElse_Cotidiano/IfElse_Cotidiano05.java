package IfElse_Cotidiano;
import java.util.Scanner;

public class IfElse_Cotidiano05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String usuarioCorreto = "admin";
            String senhaCorreta = "12345";

            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Autenticação bem-sucedida!");
            } else {
                System.out.println("Nome de usuário ou senha incorretos.");
            }

            scanner.close();
        }
    }


