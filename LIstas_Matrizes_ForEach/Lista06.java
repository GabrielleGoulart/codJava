package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista06 {
        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);
            numeros.add(6);
            numeros.add(7);
            numeros.add(8);
            numeros.add(9);
            numeros.add(10);


            System.out.println("Lista original: " + numeros);

            Iterator<Integer> iterador = numeros.iterator();
            while (iterador.hasNext()) {
                int numero = iterador.next();
                if (numero % 2 != 0) {
                    iterador.remove();
                }
            }

            System.out.println("Lista após remoção dos ímpares: " + numeros);
        }
    }


