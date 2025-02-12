package While;
import java.util.Scanner;

public class DoWhile_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira numeros ou letras: ");
        String str = sc.nextLine();

        int i = 0;

        do {
            System.out.println(str.charAt(i));  // Imprime o caractere na posição 'i'
            i++;  // Incrementa 'i' para acessar o próximo caractere
        } while (i < str.length());  // A condição verifica se 'i' é menor que o tamanho da string

        sc.close();
    }
}

