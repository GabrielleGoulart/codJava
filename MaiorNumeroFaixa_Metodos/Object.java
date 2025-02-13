package MaiorNumeroFaixa_Metodos;

public class Object {
        // Método para verificar a faixa do número
        public void verificarFaixa(int numero) {
            if (numero >= 1 && numero <= 10) {
                System.out.println("Faixa A");
            } else if (numero >= 11 && numero <= 20) {
                System.out.println("Faixa B");
            } else if (numero >= 21 && numero <= 30) {
                System.out.println("Faixa C");
            } else {
                System.out.println("Número fora das faixas de classificação.");
            }
        }

        // Método que recebe um valor inteiro e retorna uma string formatada
        public String showResult(int value) {
            return "resultado: " + value;
        }
    }
