package LIstas_Matrizes_ForEach;

import java.util.Arrays;
import java.util.List;

public class ForEach24 {
    public static void main(String[] args) {

                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}

