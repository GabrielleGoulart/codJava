package Exercicio2;

public class Bicicleta extends Veiculo{
    public Bicicleta() {
        super();
    }

    @Override
    public void mover(){
        super.mover();
        System.out.println("A bicicleta está se movendo lentamente");
    }
}
