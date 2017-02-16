
package poligonosregulares;

/**
 *
 * @author Cyberspace
 */

import java.util.*;

public class PoligonosRegulares {

    public static void main(String[] args) {
        String opcion;
        do {            
            Scanner teclado = new Scanner(System.in);
        
        System.out.println("Programa de Poligonos Regulares");
        
        System.out.println("Por favor digite la cantidad de lados");
        int cantidadDeLados = teclado.nextInt();
        System.out.println("Por favor digite la medida de lado");
        int medidaDelLado = teclado.nextInt();
        
        
        Poligonos nuevafigura = new Poligonos(cantidadDeLados,medidaDelLado);
        System.out.println(nuevafigura.toString());
        
        
        System.out.println("Desea calcular otra figura ? s/n ");
         opcion = teclado.next();
        } while (!opcion.equals("n"));
        
    }
    
}
