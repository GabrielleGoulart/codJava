package CompararIdade_Metodos;
import java.util.Scanner;

import static CompararIdade_Metodos.Object.verificarCategoria;

//Codigo que verifica em que classificação sua idade pertence
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = Idade(sc);
        String categoria = verificarCategoria(idade); // Chama o método Idade para obter a idade do usuário

        System.out.println(categoria);

        sc.close();
    }

    public static int Idade(Scanner sc) {
        System.out.print("Digite a sua idade: ");
        return sc.nextInt();
    }
}
