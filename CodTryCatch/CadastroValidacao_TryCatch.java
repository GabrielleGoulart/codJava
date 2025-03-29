 import java.util.Scanner;

 public class CadastroValidacao_TryCatch extends Exception {
     public CadastroValidacao_TryCatch(String mensagem) {
         super(mensagem);
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         try {
             System.out.print("Digite seu nome: ");
             String nome = sc.nextLine();
             System.out.print("Digite sua idade: ");
             int idade = sc.nextInt();

             if (nome.isEmpty() || idade < 0) {
                 throw new CadastroValidacao_TryCatch("Nome ou idade inválidos.");
             }

             System.out.println("Nome: " + nome);
             System.out.println("Idade: " + idade);

         } catch (CadastroValidacao_TryCatch e) {
             System.err.println("Erro: " + e.getMessage());
             sc.close();
         }
     }
 }

