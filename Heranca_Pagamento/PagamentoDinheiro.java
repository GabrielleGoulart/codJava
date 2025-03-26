package Exercicio4;

public class PagamentoDinheiro extends Pagamento{
    @Override
    public void realizarPagamento(){
        super.realizarPagamento();
        System.out.println("Pagamento em dinheiro recebido!");
    }
}
