/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.objetos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lucia
 * Métodos:
 * • llenarJuego(ArrayList Jugador jugadores, Revolver r): este método recibe 
 * los jugadores y el revolver para guardarlos en los atributos del juego.
 * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de
 * agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y 
 * se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno 
 * se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe 
 * mostrar que jugador se mojó.
 * Pensar la lógica necesaria para realizar esto, usando los atributos de la 
 * clase Juego.
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua r;

    public Juego() {
        this.jugadores = new ArrayList<>();
    }
    public void llenarJuego (ArrayList<Jugador> jugadores, RevolverAgua r){
        this.jugadores=jugadores;
        this.r=r;
    }
    public void ronda(){
        int i=0;
        boolean ronda=false;
        do{
        jugadores.get(i).disparo(r);
         if (jugadores.get(i).isMojado()){
             System.out.println("Se mojo el "+ jugadores.get(i).getNombre());
             ronda=true;
             break;
         } else System.out.println("El " + jugadores.get(i).getNombre() + " sigue en juego!");
         if (i==jugadores.size()-1){
             i=0;
         } else
             i++;
             
        } while (ronda==false);
        
    }
}
