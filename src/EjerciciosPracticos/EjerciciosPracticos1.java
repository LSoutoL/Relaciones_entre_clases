/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;

import EjerciciosPracticos.Enum.Raza;
import EjerciciosPracticos.objetos.Perro;
import EjerciciosPracticos.objetos.Persona;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class EjerciciosPracticos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Perro p1 = new Perro("Pepa",Raza.COQUER , 5, 50);
        Perro p2 = new Perro("Baloo", Raza.LABRADOR, 1, 140);
        Persona a = new Persona("Lucia", "Souto", 32, 35866027, p1);
        Persona b = new Persona("Lautaro", "Valenzuela", 33, 35159044, p2);
        System.out.println(a);
        System.out.println(b);
    }
    
}
