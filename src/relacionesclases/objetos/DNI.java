/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesclases.objetos;

/**
 *
 * @author lucia
 */
public class DNI {
    private char serie;
    private long numero;

    public DNI() {
    }

    public DNI(char serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public long getNumero() {
        return numero;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
}
