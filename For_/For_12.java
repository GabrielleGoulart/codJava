package For_;

public class For_12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            double base = i;
            double expoente = 3;
            double resultado = Math.pow(base, expoente);
            System.out.println("Cubos dos numeros de 1 a 10: " + (int) resultado);
        }

    }
}
