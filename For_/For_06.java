package For_;

public class For_06 {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                soma += i;

            }
        }

        System.out.println("Soma dos números ímpares de 1 a 100 é: " + soma);
    }
}