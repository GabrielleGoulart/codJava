package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Random;

public class Lista04 {
    public static void main(String[] args) {
            Random random = new Random();

            ArrayList<Integer> numeros = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                int numeroAleatorio = random.nextInt(100) + 1;
                numeros.add(numeroAleatorio);
            }

            System.out.println("Números gerados: " + numeros);

            // Inicializando as variáveis para o maior e o menor número
            int maiorNumero = numeros.get(0);
            int menorNumero = numeros.get(0);

            for (int numero : numeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }


            System.out.println("Maior número: " + maiorNumero);
            System.out.println("Menor número: " + menorNumero);
        }
    }



