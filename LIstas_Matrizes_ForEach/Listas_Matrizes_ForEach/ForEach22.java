package Listas_Matrizes_ForEach;

import java.util.Arrays;
import java.util.List;

public class ForEach22 {
    public static void main(String[] args) {
            List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50);
            int soma = 0;
            for (int numero : lista) soma += numero;
            System.out.println("Soma: " + soma);
        }
    }

