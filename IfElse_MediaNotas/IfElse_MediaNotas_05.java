package If_else;

import java.util.Scanner;

public class IfElse_MediaNotas_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua nota na disciplina1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite sua nota na disciplina2: ");
        double nota2 = sc.nextDouble();
        int disciplinasAprovadas = 0;

        if (nota1 >= 6.0) disciplinasAprovadas++;

        if (nota2 >= 6.0) disciplinasAprovadas++;

        if (disciplinasAprovadas >= 2) {
            System.out.println("O aluno foi aprovado em duas ou mais disciplinas.");
        } else {
        System.out.println("O aluno não foi aprovado em duas disciplinas.");
    }

        sc.close();
}

}
