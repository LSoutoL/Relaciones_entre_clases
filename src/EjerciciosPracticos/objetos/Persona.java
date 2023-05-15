/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.objetos;

/**
 *
 * @author lucia
 * con atributos: nombre, apellido, edad, documento y Perro.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long DNI;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long DNI, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public long getDNI() {
        return DNI;
    }

    public Perro getMascota() {
        return mascota;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", mascota=" + mascota + '}';
    }
    
    
}
