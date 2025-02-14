package DoacaodeSangue_Metodos;

public class Object {
    public void verificarDoacao() {
        int idade = 0;
        int peso = 0;
        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você pode doar sangue");
        } else {
            System.out.println("Você não pode doar sangue");
        }
    }
    public String formatarCategoria() {
        int idade = 0;
        return "Idade = " + idade + " - Categoria: " + verificarCategoria(idade);
    }

    // Método para verificar a categoria da idade
    public String verificarCategoria(int idade) {
        if (idade < 18) {
            return "Menor de idade";
        } else if (idade <= 65) {
            return "Adulto";
        } else {
            return "Idoso";
        }


    }
}