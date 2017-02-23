
package conjutonumeros;

import java.util.*;

/**
 *
 * @author Cyberspace
 */
public class ConjutoNumeros {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int opcion = 0;
        do {            
            System.out.println("Programa para calcular promedios");
        System.out.println("Digite el numero de elementos del conjunto");
        int total = teclado.nextInt();
        teclado.nextLine();
        ArrayList arreglo = new ArrayList();
        
        for (int i = 0; i < total ; i++) {
            System.out.println("Digite un numero ");
            arreglo.add(teclado.nextInt());
            teclado.nextLine();
            
        }
        
        Conjunto conjunto1 = new Conjunto(arreglo);
        System.out.println(conjunto1.toString());
        System.out.println("Calcular .1");
        System.out.println("Salir .2 ");
        System.out.println("Desea volver a ejecutar el programa 1.c / 2.s");
        opcion = teclado.nextInt();
        teclado.nextLine();
        } while (opcion != 2);
            
       
    }
    
}
