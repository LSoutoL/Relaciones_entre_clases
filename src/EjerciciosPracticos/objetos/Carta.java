/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.objetos;


import EjerciciosPracticos.Enum.Palo;

/**
 *
 * @author lucia
 */
public class Carta {
    private int numero;
    private Palo palo;
   

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    

    @Override
    public String toString() {
        return numero + " DE " + palo;
    }
    
}
