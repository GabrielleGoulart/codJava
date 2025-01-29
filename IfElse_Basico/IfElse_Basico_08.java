package If_else;

import java.util.Scanner;


public class IfElse_Basico_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere para verificar se é uma vogal: ");

        char letra = sc.next().charAt(0);

                    if (letra == 'A' || letra == 'a' ||
                        letra == 'E' || letra == 'e' ||
                        letra == 'I' || letra == 'i' ||
                        letra == 'O' || letra == 'o' ||
                        letra == 'U' || letra == 'u') {

                        System.out.println("A letra que digitou é uma vogal");
                } else {
                    System.out.println("A letra que digitou não é uma vogal");
                }

                sc.close();
            }
        }

