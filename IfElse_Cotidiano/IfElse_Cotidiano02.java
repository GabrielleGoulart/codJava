package IfElse_Cotidiano;
import java.util.Scanner;

public class IfElse_Cotidiano02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo de acesso: ");
        double codigo = sc.nextDouble();

        if (codigo == 123987) {
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Falha no codigo de acesso");
        }
        sc.close();
    }
}
