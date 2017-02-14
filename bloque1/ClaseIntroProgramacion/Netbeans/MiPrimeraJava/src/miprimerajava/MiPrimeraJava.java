
package miprimerajava;

import java.util.Scanner;

/**
 *
 * @author Cyberspace
 */
public class MiPrimeraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        /*
      
        String nombre = "Ariel";
        int edad = 33;
        System.out.println("Mi nombre es " + nombre + "tengo : " + edad + " años");
        
        
        int numDos, numUno;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite numero 1");
        numDos = teclado.nextInt();
        System.out.println("Digite numero 2");
        numUno = teclado.nextInt();
        System.out.println("La suma de los numeros es = " + (numUno + numDos));
                
        //System.out.println("Mi nombre es " + nombre + "tengo : " + edad + " años");
        
        System.out.println("Programa para carcular Perimetro de un Triangulo");
        int numDos, numUno, numTres;
        System.out.println("Digite lado 1");
        numUno = teclado.nextInt();
        System.out.println("Digite lado 2");
        numDos = teclado.nextInt();
        System.out.println("Digite lado 3");
        numTres = teclado.nextInt();
        int resultado = (numUno + numDos+numTres);
        System.out.println("El perimetro es = " + resultado);  
                
                */
      
      
      /*
        System.out.println("Opcion 1 Area de cuadrado");
        System.out.println("Opcion 2 Area de Triangulo");
        System.out.println("Opcion 3 Area de Circulo");
        System.out.println("Por favor digite una opcion");
        int opcion = teclado.nextInt();
        
        
        if (opcion == 1) {
            System.out.println("Digite el valor del lado");
            int lado = teclado.nextInt();
            int area = lado * lado;
            System.out.println("El area mide " + area );
        } else if(opcion == 2) {
            System.out.println("Digite el valor de la altura" );
            int altura = teclado.nextInt();
            
            System.out.println("Digite el valor de la base" );
            int base = teclado.nextInt();
            int area = base * altura / 2;
            System.out.println("El area mide " + area);
            
        } else {
            System.out.println("Digite el radio" );
            int radio = teclado.nextInt();
            
            double area =(radio * radio)* 3.14;
            System.out.println("El area mide " + area);
            
        }
        */
      
      
      System.out.println("Digite su edad " );
      int edadTest = teclado.nextInt();
      
        if (edadTest < 0) {
            System.out.println("no ha nacido");
        }
        else if(edadTest > 0 && edadTest <= 11 ){
            System.out.println("niño");       
      }
        else if(edadTest > 11 && edadTest <= 17 ){
            System.out.println("Adolesente");       
      }
        else if(edadTest > 17 && edadTest <= 60 ){
            System.out.println("Adulto");       
      }else {
            System.out.println("Adulto mayor");
        }
      
      
    }
    
}
