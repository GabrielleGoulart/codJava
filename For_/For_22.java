package For_;

import java.util.Scanner;

public class For_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println("os numeros divisiveis por " + num + " são: " + i);

                sc.close();
            }
        }


    }
}
