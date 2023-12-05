package com.example;

import java.util.Scanner;

public class InputOutput {

    private static Scanner input = new Scanner(System.in);
    
    public static String leerString() {
        return input.nextLine();
    }



    public static int leerInt() {

        while (!input.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            input.next(); 
        }

        int numero = input.nextInt();
        return numero;
    }

}
