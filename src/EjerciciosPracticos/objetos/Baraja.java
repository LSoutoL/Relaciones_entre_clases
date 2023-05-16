/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.objetos;


import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas=new ArrayList<>();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja actual:" + cartas;
    }
    
    
    
    
}
