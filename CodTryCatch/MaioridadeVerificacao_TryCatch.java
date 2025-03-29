import java.util.Scanner;

public class MaioridadeVerificacao_TryCatch extends Exception {
    public MaioridadeVerificacao_TryCatch(String mensagem) {
        super(mensagem);
    }
}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Digite a idade: ");
                int idade = sc.nextInt();

                if (idade < 0) {
                    throw new MaioridadeVerificacao_TryCatch("Idade inválida: não pode ser negativa.");
                }

                if (idade >= 18) {
                    System.out.println("A pessoa é maior de idade.");
                } else {
                    System.out.println("A pessoa é menor de idade.");
                }

            } catch (MaioridadeVerificacao_TryCatch e) {
                System.out.println("Erro: " + e.getMessage());

                sc.close();
            }
        }
    }