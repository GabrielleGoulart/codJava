package If_else;

import java.util.Scanner;

public class IfElse_Basico_10 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um número: ");

                int numero = sc.nextInt();

                if(numero >= 100 && numero <= 200){
                    System.out.println("o numero está entre 100 a 200");
                }else{
                    System.out.println("o numero não está entre 100 a 200");
                }
                sc.close();
            }
        }
