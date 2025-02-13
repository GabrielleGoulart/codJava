package For_;

import java.util.Scanner;

public class For_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String inputString = sc.nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
        }

        sc.close();
    }
}
