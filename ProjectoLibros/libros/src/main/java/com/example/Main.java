package com.example;

public class Main {
    public static void main(String[] args) {

        libreria libreria = new libreria();

        int eleccion;

        do {

            System.out.println("");
            System.out.println("  Biblioteca");
            System.out.println("--------------");
            System.out.println(" ");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Buscar un libro");
            System.out.println("3. Lista de libros");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Elige una opcion: ");

            eleccion = InputOutput.leerInt();

            System.out.println("");

            if (eleccion == 1) {

                System.out.print("Introduzca el ID: ");
                int id = InputOutput.leerInt();

                System.out.print("Introduzca el titulo del libro: ");
                String nombre = InputOutput.leerString();

                System.out.print("Introduzca el autor del libro: ");
                String autor = InputOutput.leerString();

                System.out.print("Introduzca cantidad de libros: ");
                int cantidad = InputOutput.leerInt();

                libreria.agregarlibro(id, nombre, autor, cantidad);

            }

            else if (eleccion == 2) {

                System.out.println("1. Buscar por título ");
                System.out.println("2. Buscar por autor ");
                System.out.println("3. Volver atrás");

                System.out.print("Elige una opcion: ");
                int eleccion2 = InputOutput.leerInt();

                if (eleccion2 == 1) {

                    System.out.print("Introduce el título: ");
                    String titulo = InputOutput.leerString();

                    libreria.buscartitulo(titulo);

                }

                if (eleccion2 == 2) {

                    System.out.print("Introduce el autor: ");
                    String autor = InputOutput.leerString();

                    libreria.buscarautor(autor);

                }

                if (eleccion2 == 3) {

                }

            }

            else if (eleccion == 3) {
                
                libreria.mostrarlibros();

            }
            
            else{

                System.out.println("Opción no valida, elija del 1-3, o 4 para salir.");
                
            }

        } while (eleccion != 4);
    }
}