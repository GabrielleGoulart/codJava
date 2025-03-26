package Exercicio3;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);

    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario() * 1.10;
    }
}
