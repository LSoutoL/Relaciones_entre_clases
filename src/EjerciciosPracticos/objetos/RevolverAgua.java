/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.objetos;

/**
 *
 * @author lucia
 * Clase Revolver de agua: esta clase posee los siguientes atributos: 
 * posición actual (posición del tambor que se dispara, puede que esté el agua 
 * o no) y posición agua (la posición del tambor donde se encuentra el agua). 
 * Estas dos posiciones, se generarán aleatoriamente.
 * Métodos:
 * • llenarRevolver(): le pone los valores de posición actual y de posición 
 * del agua. Los valores deben ser aleatorios.
 * • mojar(): devuelve true si la posición del agua coincide con la posición 
 * actual
 * • siguienteChorro(): cambia a la siguiente posición del tambor
 * • toString(): muestra información del revolver (posición actual y donde está 
 * el agua)
 */
public class RevolverAgua {
    private Integer posicActual;
    private Integer posicAgua;

    public RevolverAgua() {
    
    }

    public RevolverAgua(Integer posicActual, Integer posicAgua) {
        this.posicActual = posicActual;
        this.posicAgua = posicAgua;
    }
       
    public Integer getPosicActual() {
        return posicActual;
    }

    public Integer getPosicAgua() {
        return posicAgua;
    }

    public RevolverAgua(Integer posicActual) {
        this.posicActual = posicActual;
    }
    public void llenarRevolver(){
        this.posicActual= (int)Math.round(Math.random()*6);
        this.posicAgua=(int) Math.round(Math.random()*6);
    }
    public boolean mojar (){
        return posicActual.equals(posicAgua);
    }
    public void siguienteChorro (){
        if (posicActual<6){
        this.posicActual++;}
        else {this.posicActual=1;}
        //this.posicionActual = (posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicActual=" + posicActual + ", posicAgua=" + posicAgua + '}';
    }
    
}
