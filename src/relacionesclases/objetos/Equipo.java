/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesclases.objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
    this.jugadores=new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del jugador");
            String nombre = leer.next();
            System.out.println("Ingrese el numero de posicion");
            int posicion=leer.nextInt();
            jugadores.add(new Jugador(nombre, posicion));    
        }
    }

    public Equipo(String nombre, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
