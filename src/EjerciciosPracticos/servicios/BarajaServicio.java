/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos.servicios;


import EjerciciosPracticos.Enum.Palo;
import EjerciciosPracticos.objetos.Baraja;
import EjerciciosPracticos.objetos.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lucia
 *
 */
public class BarajaServicio {
    private Baraja baraja = new Baraja();
    
    public void llenarBaraja(){
     ArrayList <Carta> cartas = new ArrayList<>();
     mazoPorPalo(Palo.BASTO, cartas);
     mazoPorPalo(Palo.COPA, cartas);
     mazoPorPalo(Palo.ESPADA, cartas);
     mazoPorPalo(Palo.ORO, cartas);
     baraja.setCartas(cartas);
    }
    public void mazoPorPalo(Palo palo, ArrayList <Carta> cartas){
        Integer aux =1;
        for (int i = 0; i < 10; i++) {
            if (aux.equals(8)){
                aux=aux+2;
            }
            cartas.add(new Carta(aux, palo));
            aux++;
        }
    }
    
    /*• barajar(): cambia de posición todas las cartas aleatoriamente.*/
    public void barajar(){
       Collections.shuffle(baraja.getCartas());
    }
    /*• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando 
    * no haya más o se haya llegado al final, se indica al usuario que no hay más 
    * cartas.*/
    
    public int siguienteCarta(int carta){
        if (carta==0){
           System.out.println(baraja.getCartas().get(carta)); 
        } else if (carta<baraja.getCartas().size()){
        System.out.println(baraja.getCartas().get(carta+1));
        } else System.out.println("Baraja finalizada.");
        return carta++;
    }
    /* • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se 
    * saca una carta y luego se llama al método, este no mostrara esa primera carta.*/
    public void mostrarBaraja(){
        for (Carta carta : baraja.getCartas()) {
            System.out.println(carta);
        }
    }
    /* cartasDisponibles(): indica el número de cartas que aún se puede repartir.*/
    
    public int cartasDisponibles(int carta){
        return baraja.getCartas().size()-carta;
    }
    
    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
    * número de cartas. En caso de que haya menos cartas que las pedidas, no 
    * devolveremos nada, pero debemos indicárselo al usuario.*/
    
    public int darCartas(int carta, Scanner leer){
        System.out.println("Indique la cantidad de cartas que desea dar");
        int cant = leer.nextInt();
        if (cant<=cartasDisponibles(carta)){
            for (int j = carta; j < carta+cant; j++) {
                System.out.println(baraja.getCartas().get(j));
                carta+=cant;
            }
    } else System.out.println("Las cartas disponibles en la baraja son menos que las requeridas.");
    return carta;
    }
    
    /*• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido 
    * ninguna indicárselo al usuario*/
    
    public void cartasMonton(int carta){
        if (carta>0){
            for (int i = 0; i == carta; i++) {
                System.out.println(baraja.getCartas().get(i));
            }
        } else if (carta==0){
            System.out.println(baraja.getCartas().get(carta));
        } else System.out.println("Aun no han salido cartas.");
    }
    
    public void usarBaraja (){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
        int carta=0;
        do{
        System.out.println("Indique la accion que desea realizar:");
        System.out.println("1. Barajar");
        System.out.println("2. Dar cartas");
        System.out.println("3. Dar siguiente carta");
        System.out.println("4. Ver la cantidad de cartas disponibles");
        System.out.println("5. Ver las cartas que ya salieron");
        System.out.println("6. Mostrar baraja");
        System.out.println("7. Salir");
        switch(opcion){
            case 1: barajar();
            break;
            case 2: carta=darCartas(carta,leer);
            break;
            case 3: carta=siguienteCarta(carta);
            break;
            case 4: System.out.println("Las cartas disponibles son " + (cartasDisponibles(carta)-1));
            break;
            case 5: cartasMonton(carta);
            break;
            case 6: mostrarBaraja();
            break;            
        }
        } while (opcion!=7);
    }
    
    
    
}
