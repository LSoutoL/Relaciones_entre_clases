/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.objetos;

import EjerciciosPracticos.Enum.Raza;

/**
 *
 * @author lucia
 * tendrá como atributos: nombre, raza, edad y tamaño;
 */
public class Perro {
    private String nombre;
    private Raza raza;
    private int edad;
    private int tamanio;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, int tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "años " +", tamanio=" + tamanio + "cms" + '}';
    }
    
    
}
