/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Rafael Avila
 */
public   class Almacenamiento {

    //este le usamos como un metodo en el que podemos guardar los datos txt en los arrays
    public static void almacenarDatos(ArrayList<Persona> listap) {

        try {

            //Creamos la instancia de stream para el alacenamiento de los datos de los archivos txt con la clase file y el metodo lines 
            //depsues con la clase paths y el metodo de get vamos a especificar la rta donde se encuentra el archivo
            Stream<String> datos = Files.lines(Paths.get("C:\\Users\\Christian\\Desktop\\archivo.txt"));

            //el metodo map se utiliza aqui para convertir cada linea en un objeto que en este caso seria persona
            datos.map(datop -> {

                String[] extension = datop.split(" ");  //se hace la separaicon de datos  o campos del registro por medio del metodo split con las  comillas " " que son los parametros F

                return new Persona(
                        extension[0],
                        extension[1],
                        extension[2]
                );
            }).forEach(listap::add);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

}
