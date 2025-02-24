package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Collections;

public class Lista09 {
        public static void main(String[] args) {
            ArrayList<String> elementos = new ArrayList<>();

            Collections.addAll(elementos, "Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5", "Elemento 6", "Elemento 7");

            // Inverte e exibe a lista
            Collections.reverse(elementos);
            System.out.println(elementos);
        }
    }


