package Exercicio3;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabrielle", 2.0);
        Gerente gerente = new Gerente("Ingrid", 5000.0,1000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lavinia", 20000.0);

        System.out.println("Salário do Funcionário " + funcionario.getNome() + ": " + funcionario.calcularSalario());
        System.out.println("Salário do Gerente " + gerente.getNome() + ": " + gerente.calcularSalario());
        System.out.println("Salário do Desenvolvedor " + desenvolvedor.getNome() + ": " + desenvolvedor.calcularSalario());
    }
}
