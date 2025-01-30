package IfElse_Cotidiano;
import java.util.Scanner;

    public class IfElse_Cotidiano04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("digite sua idade: ");
            int idade= sc.nextInt();

            System.out.print("digite seu peso: ");
            double peso= sc.nextDouble();

            if (idade >= 18 && idade <=65 && peso >= 50) {
                System.out.println("Voce pode doar sangue");
            }else {
                System.out.println("Voce não pode doar sangue");
            }
            sc.close();
        }
}
