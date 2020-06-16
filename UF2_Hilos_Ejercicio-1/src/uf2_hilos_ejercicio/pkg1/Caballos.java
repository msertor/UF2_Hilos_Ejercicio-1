
package uf2_hilos_ejercicio.pkg1;
import java.util.logging.*;

public class Caballos implements Runnable {
    private String nombre;    
    private int minutos;
    
Caballos(String nombre, int minutos){
    this.nombre=nombre;
    this.minutos=minutos;
}
    
    public void run(){
        try{
         if (nombre.equals(("Caballo1"))){
             Thread.sleep(minutos*1000);
             System.out.println("El " + nombre + " ha tardado " + minutos + " minutos");
         }
         if (nombre.equals(("Caballo2"))){
             Thread.sleep(minutos*1000);
             System.out.println("El " + nombre + " ha tardado " + minutos + " minutos");
         }
         if (nombre.equals(("Caballo3"))){
             Thread.sleep(minutos*1000);
             System.out.println("El " + nombre + " ha tardado " + minutos + " minutos");
         }
        } catch (InterruptedException ex){
            Logger.getLogger(Caballos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
}
