/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesclases;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesclases.objetos.DNI;
import relacionesclases.objetos.Equipo;
import relacionesclases.objetos.Jugador;
import relacionesclases.objetos.Persona;

/**
 *
 * @author lucia
 */
public class RelacionesClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
    // MANOS A LA OBRA 1
    //Realiza un programa en donde una clase Persona tenga como atributo nombre,
    //apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la 
    //serie (carácter) y número. Prueba acceder luego a los atributos del dni 
    //de la persona creando objetos y jugando desde el main.
    /*DNI nuevo = new DNI ();
    nuevo.setSerie('a');
    nuevo.setNumero(35866027);
    Persona nueva = new Persona();
    nueva.setNombre("lucia");
    nueva.setApellido("souto");
    nueva.setNum(nuevo);*
        System.out.println(nueva.getNum());
     */
    //MANOS A LA OBRA 2
    /*
    Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
    */
    Equipo boca = new Equipo();
    boca.setNombre("boca");
        for (Jugador jugador: boca.getJugadores()) {
            System.out.println(jugador);
        }
    
    /*
        EJERCICIO UML
        Realiza el diagrama UML de los ejercicios de manos a la obra que hicimos arriba:
        • El de Persona
        • Dni y el de Equipo
        • Jugadores
    */
    
    
    
}
}
