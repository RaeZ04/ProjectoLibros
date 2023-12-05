package com.example;

import java.util.ArrayList;

public class libreria {

    ArrayList<libro> libros = new ArrayList<>();
    

    public void agregarlibro(int id, String nombre, String autor, int unidades) {

        libro nuevoLibro = new libro(id, nombre, autor, unidades);
        libros.add(nuevoLibro);
        System.out.println("");
        System.out.println("Libro agregado con ID: " + nuevoLibro.getId() + ", Título: " + nuevoLibro.getNombre() + ", Autor: " + nuevoLibro.getAutor() + ", Cantidad: " + nuevoLibro.getUnidades() + ".");

    }

    public void buscartitulo (String titulo){

        System.out.println("Resultados de la busqueda: ");
        System.out.println("");

        for(libro libro:libros){

            if (libro.getNombre().equalsIgnoreCase(titulo)) {
                
                libro.mostrarInformacion();

            }

        }

    }

}
