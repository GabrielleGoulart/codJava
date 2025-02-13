package For_;
import java.util.Scanner;
public class For_18 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite algo ");
                String texto = scanner.nextLine();

                texto = texto.replaceAll("\\s", "").toLowerCase();
                String textoInvertido = new StringBuilder(texto).reverse().toString();

                if (texto.equals(textoInvertido)) {
                    System.out.println("A string é um palíndromo.");
                } else {
                    System.out.println("A string não é um palíndromo.");
                }


                scanner.close();
            }
        }
