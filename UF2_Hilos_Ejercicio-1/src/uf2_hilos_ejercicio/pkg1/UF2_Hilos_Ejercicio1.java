
package uf2_hilos_ejercicio.pkg1;
import java.util.ArrayList;

public class UF2_Hilos_Ejercicio1 {

    
    public static void main(String[] args) throws InterruptedException {
        Caballos c1= new Caballos("Caballo1", (int)(Math.random()*6));
        Caballos c2= new Caballos("Caballo2", (int)(Math.random()*6));
        Caballos c3= new Caballos("Caballo3", (int)(Math.random()*6));
        
        Thread t=new Thread(c1);
        System.out.println("Sale el caballo 1");
            t.start();
            
        Thread t2=new Thread(c2);
        System.out.println("Sale el caballo 2");
            t2.start();
            
        Thread t3=new Thread(c3);
        System.out.println("Sale el caballo 3");
            t3.start();
    }
    
}
