package For_;

public class For_15 {
    public static void main(String[] args) {

     System.out.println("Exibiçao de numeros de 1 a 100: ");

     for (int i = 1; i <= 100; i++) {

         if (i % 3 == 0) {
             System.out.println(i + " Fizz");
         }else if (i % 5 == 0) {
             System.out.println(i + " Buzz");
         }else {
             System.out.println(i);

         }

     }
    }
}
