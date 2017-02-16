
package mientras;

/**
 *
 * @author Cyberspace
 */
import java.util.*;
public class Mientras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Area de cuadrado");
        System.out.println("2. Area de circulo");
        System.out.println("3. Salir");
        System.out.println("Por favir digite una opcion");
        int opcion = teclado.nextInt();
        while (opcion != 3) {
            if (opcion == 1 ) {
                System.out.println("Digite el valor del lado");
                int lado = teclado.nextInt();
                int area = lado * lado;
                System.out.println("El valor del area es " + area);
            } else {
                System.out.println("Digite el valor del radio");
                int radio = teclado.nextInt();
                double area = (radio * radio)*3.14;
                System.out.println("El valor del area es " + area);
            }
            System.out.println("1. Area de cuadrado");
            System.out.println("2. Area de circulo");
            System.out.println("3. Salir");
            System.out.println("Por favir digite una opcion");
            opcion = teclado.nextInt();
            
        }
        
        
    }
    
}
