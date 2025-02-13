package DoacaodeSangue_Metodos;

public class Object {

            public static void verificarDoacao(int idade, double peso) {
                if (idade >= 18 && idade <= 65 && peso >= 50) {
                    System.out.println("Você pode doar sangue");
                } else {
                    System.out.println("Você não pode doar sangue");
                }
            }


            public static String doacao(int valor) {
                return "resultado: " + valor;
            }

            }

