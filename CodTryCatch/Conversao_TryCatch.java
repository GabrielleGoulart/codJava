package com.atvI;
import java.util.Scanner;

public class Conversao_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     try{
        System.out.print("Digite algum número: ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("Você digitou um número: "+ num);
    } catch(NumberFormatException e) {
         System.err.println("Erro! Você digitou um número errado");
     }
         sc.close();
     }
   }

