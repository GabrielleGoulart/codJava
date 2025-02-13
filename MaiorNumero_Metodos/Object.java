package MaiorNumero_Metodos;

public class Object {
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }


    // Método que recebe um valor inteiro e retorna uma string formatada
    public static String showResult(int value) {
        // Retorna uma string concatenando o texto "Higher = " com o valor fornecido
        return "Higher = " + value;
    }
}