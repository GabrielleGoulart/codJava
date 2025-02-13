package For_;

public class For_14 {

    //Metodo ehPrimo: verifica se um numero é primo
    public static boolean ehPrimo(int num){

        // se for menor ou igual a 1 ele não é primo
            if (num <= 1) return false;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    public static void main(String[] args) {

            System.out.println("Numeros primos entre 1 e 50: ");
          for (int num = 1; num <= 50; num++)
              if (ehPrimo(num))
                  //exibe os numeros primos
                    System.out.println(num + " ");

            }

            }

