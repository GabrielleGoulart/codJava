package LIstas_Matrizes_ForEach;

import java.util.Arrays;
import java.util.List;

public class ForEach_Matriz30 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, -5, 3, -2, 7, -1, 4);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 0) {
                numeros.set(i, 0);
            }
        }

        System.out.println("Lista após substituir os valores negativos por zero: " + numeros);
    }
}