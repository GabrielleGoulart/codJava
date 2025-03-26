package Exercicio4;

public class PagamentoCartao extends Pagamento{
    @Override
    public void realizarPagamento(){
        super.realizarPagamento();
        System.out.println("Pagamento com cartão aprovado!");
    }
}
