package For_;

public class For_25 {
    public static void main(String[] args) {
            int altura = 5;

            for (int i = 1; i <= altura; i++) {
                for (int j = i; j < altura; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
        }
    }
}
