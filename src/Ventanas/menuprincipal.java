/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Ventanas.Almacenamiento;
import Ventanas.EjercicioStream;
import java.util.ArrayList;

/**
 *
 * 
 */
public class menuprincipal {

    //declaramos el array pasra agrupar los elementos en un vector
    public static ArrayList<Persona> listPersona = new ArrayList<>();

    //hacemos en la funcion prncipal para ejecutar las siguietes clases como almacenamiento y EjercicioStream
    public static void main(String[] args) {

        Almacenamiento.almacenarDatos(listPersona);

        new EjercicioStream().setVisible(true);

    }

}
