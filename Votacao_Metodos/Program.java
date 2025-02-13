package Votacao_Metodos;

import java.util.Scanner;

import static Votacao_Metodos.Object.VerificadorIdade.verificarSituacaoVoto;


public class Program {

    public static void main(String[] args) {
        int anoNascimento = lerAnoNascimento();
        int idade = (anoNascimento);

        String resultado = verificarSituacaoVoto(idade);

        System.out.println(resultado);
    }

    public static int lerAnoNascimento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();


        return anoNascimento;
    }
}