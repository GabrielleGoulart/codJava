package While;

public class DoWhile_36 {
    public static void main(String[] args) {

        int num = 1;
        int soma = 0;

        do {
            soma += num;
            num++;

        } while (num <= 50);
        System.out.println("Soma dos numeros de 1 a 50 é:  " + soma);
    }
}