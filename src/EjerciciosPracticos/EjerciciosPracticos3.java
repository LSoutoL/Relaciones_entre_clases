/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;

import EjerciciosPracticos.objetos.Baraja;
import EjerciciosPracticos.servicios.BarajaServicio;

/**
 *
 * @author lucia
 */
public class EjerciciosPracticos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BarajaServicio service = new BarajaServicio();
      service.llenarBaraja();
      service.usarBaraja();
    }
    
}
