package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
        //declarando constante

         private final static String WELCOME_MESSAGE = "Olá inform o seu nome";
    public static void main(String[] args) {


        //não vai parar o breakpoint
         Scanner scanner = new Scanner(System.in) ;
        System.out.println(WELCOME_MESSAGE);

        String name = scanner.next();

        System.out.println("Olá informe agora a sua idade \n");
        //nextInt utilizado para receber inteiros
        int age = scanner.nextInt();

        System.out.printf("olá %s, vocÊ tem %s anos",name, age);
    }*/

    //estudando keywords

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Quando é 2 + 2 ?");

        var result = scanner.nextInt();

        var isWrong = result != 4;

        System.out.printf("O resultado é 4, você errou? (%s)", !isWrong);

    }
}