package Votacao_Metodos;
import java.util.Scanner;

import MediaNotas_Metodos.Object;
import static Votacao_Metodos.Votacao_Metodos.verificarSituacaoVoto;

public class Program {
    public static void main(String[] args) {
        int anoNascimento = lerAnoNascimento();
        int idade = calcularIdade(anoNascimento);
        verificarSituacaoVoto(idade);
    }

    public static int lerAnoNascimento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int higher = 0;
        Object.showResult(higher);

        System.out.println(higher);
        return anoNascimento;

    }

    public static int calcularIdade(int anoNascimento) {
        int anoAtual = 2025;
        return anoAtual - anoNascimento;
    }

}
