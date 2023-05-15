/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;

import EjerciciosPracticos.objetos.Juego;
import EjerciciosPracticos.objetos.Jugador;
import EjerciciosPracticos.objetos.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author lucia
 */
public class EjerciciosPracticos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        RevolverAgua r = new RevolverAgua();
        r.llenarRevolver();
        
        ArrayList <Jugador> jugadores = new ArrayList<>();
        System.out.println("Iniciaremos el juego. Primero indique la cantidad de jugarores");
        int cant = leer.nextInt();
        if ((cant>6)||(cant<1)){
            cant=6;
        }
        for (int i = 0; i < cant; i++) {
        String nombre = "Jugador ";
        Integer id = i+1;
        nombre=nombre.concat(id.toString());
        jugadores.add(new Jugador(id, nombre));
        }
        
        Juego j1 = new Juego();
        j1.llenarJuego(jugadores, r);
        j1.ronda();
    }
    
}
