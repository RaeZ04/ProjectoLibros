package com.example;

import java.util.ArrayList;

public class libreria {

    ArrayList<libro> libros = new ArrayList<>();

    public void agregarlibro(int id, String nombre, String autor, int unidades) {

        for (libro existente : libros) {

            if (existente.getId() == id) {

                System.out.println("");
                System.out.println("Ya existe un libro con este ID. No se puede agregar.");
                return;

            }
        }

        libro nuevoLibro = new libro(id, nombre, autor, unidades);
        libros.add(nuevoLibro);
        System.out.println("");
        System.out.println("Libro agregado con ID: " + nuevoLibro.getId() + ", Título: " + nuevoLibro.getNombre()
                + ", Autor: " + nuevoLibro.getAutor() + ", Cantidad: " + nuevoLibro.getUnidades() + ".");

    }

    public void buscartitulo(String titulo) {

        System.out.println("");
        System.out.println("Resultados de la busqueda: ");
        System.out.println("");
        int contador1 = 0;

        for (libro libro : libros) {

            if (libro.getNombre().equalsIgnoreCase(titulo)) {

                libro.mostrarInformacion();
                contador1++;

            }

        }

        if (contador1 == 0) {

            System.out.println("No se ha encontrado ningún resultado.");
            System.out.println("");

        }

    }

    public void buscarautor(String autor) {

        System.out.println("");
        System.out.println("Resultados de la busqueda: ");
        System.out.println("");
        int contador2 = 0;

        for (libro libro : libros) {

            if (libro.getAutor().equalsIgnoreCase(autor)) {

                libro.mostrarInformacion();
                contador2++;

            }

        }

        if (contador2 == 0) {

            System.out.println("No se ha encontrado ningún resultado.");
            System.out.println("");

        }

    }

    public void mostrarlibros() {

        for (libro libro : libros) {

            libro.mostrarInformacion();

        }

    }

    public void sumarlibros(int idbuscar, int unidadedsañadidas) {

        int contador3 = 0;

        for (libro libro : libros) {

            if (libro.getId() == idbuscar) {

                contador3++;

                int unidadesnuevas = libro.getUnidades() + unidadedsañadidas;
                libro.setUnidades(unidadesnuevas);

                System.out.println("");
                System.out.println("Has añadido " + unidadedsañadidas + " Unidades de " + libro.getNombre()
                        + ", ahora hay " + unidadesnuevas + " Unidades.");

            }

        }

        if (contador3 == 0) {

            System.out.println("");
            System.out.println("No se ha encontrado ningun libro con ese ID.");

        }

    }

}
