/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesclases.objetos;

/**
 *
 * @author lucia
 */
public class Persona {
    private String nombre;
    private String apellido;
    private DNI num;

    public Persona(String nombre, String apellido, DNI num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num = num;
    }

    public Persona() {
        this.num= new DNI();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public DNI getNum() {
        return num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNum(DNI num) {
        this.num = num;
    }
    
    
}
