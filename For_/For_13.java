package For_;

// Declaração de classe e método principal
public class For_13 {
    public static void main(String[] args) {

        //Definiçao de variaveis
        int QuantTermo = 9;
        int termo1 = 0;
        int termo2 = 1;

// imprimindo mensagem inicial
        System.out.print("Serie de Fibonacci até " + QuantTermo + " termos: ");

        for (int i = 0; i <= QuantTermo; ++i){ // o laço for executa 10 vezes
            System.out.print(termo1 + ", "); //cada inserçao do valor atual de 'termo1' é impresso, seguido por uma virgula

            // calcula o proximo termo somando os 2 anteriores
            int novoTermo = termo1 + termo2;
            termo1 = termo2; //atualiza o valor do termo seguinte
            termo2 = novoTermo; //atualiza para o proximo valor da sequencia

        }

    }
}
