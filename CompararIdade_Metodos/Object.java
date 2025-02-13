package CompararIdade_Metodos;

public class Object {

            // Método que verifica a categoria com base na idade e retorna a categoria como string
            public static String verificarCategoria(int idade) {
                if (idade >= 0 && idade <= 11) {
                    return "Criança";
                } else if (idade >= 12 && idade <= 17) {
                    return "Adolescente";
                } else if (idade >= 18 && idade <= 59) {
                    return "Adulto";
                } else if (idade >= 60) {
                    return "Idoso";
                } else {
                    return "Idade inválida";
                }

            }

            // Método para formatar a saída como string (este método agora retorna uma String)
            public static String formatarCategoria(int idade) {
                // Chama o método verificarCategoria para obter a categoria e formata a string
                return "Idade = " + idade + " - Categoria: " + verificarCategoria(idade);
            }

    }











