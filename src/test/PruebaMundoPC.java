
package test;

import domain.Computadora;
import domain.Monitor;
import domain.Orden;
import domain.Raton;
import domain.Teclado;


public class PruebaMundoPC {
    public static void main(String[] args) {
        Monitor monitorHP=new Monitor( "HP" , 13);
        Teclado tecladoHP= new Teclado("bluetooth", "HP");
        Raton ratonHP= new Raton("bluetooth", "HP");
        Computadora computadoraHP= new Computadora( "Coputadora HP",monitorHP,tecladoHP,ratonHP);
        
         Monitor monitorGamer=new Monitor( "kk" , 16);
        Teclado tecladoolimpus= new Teclado("bluetooth", "olimpus");
        Raton ratonvip= new Raton("bluetooth", "vip");
        Computadora computadoraGamer= new Computadora("computadoraGamer",monitorGamer,tecladoolimpus,ratonvip);
        
        Orden orden1= new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        
        
    }
    
}
