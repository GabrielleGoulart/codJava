package IfElse_Cotidiano;
import java.util.Scanner;

public class IfElse_Cotidiano03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        sc.nextLine();

        System.out.print("Voce prefere que converta em Fahrenheit ou Kelvin: ");
        String converter = sc.nextLine();

        double formulaFahrenheit = (celsius * 9 / 5) + 32;
        double formulaKelvin = (celsius + 273.15);

        if (converter.equalsIgnoreCase ("Fahrenheit")) {
            System.out.println("A temperatura em Fahrenheit é: " + formulaFahrenheit);
        } else if (converter.equalsIgnoreCase ("Kelvin")) {
            System.out.println("A temperatura em Kelvin é: " + formulaKelvin);
        } else {
            System.out.println("Opção inválida");
        }

        sc.close();
    }
}


