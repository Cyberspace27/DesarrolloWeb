
package personas;

import java.util.Scanner;

/**
 *
 * @author Cyberspace
 */

import java.util.*;
public class Personas {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Programa de personas");
        System.out.println("Digite el nombre de la persona");
        String nombre = teclado.nextLine();
        System.out.println("Digite el primer Apellido");
        String apellidoUno = teclado.nextLine();
        System.out.println("Digite la edad de la persona");
        int edad = teclado.nextInt();
        Persona persona = new Persona(nombre, apellidoUno, edad);
        
        persona.calcularFechaDeNacimiento();
        

        System.out.println("Digite el segundo Apellido");
        String apellidoDos = teclado.next();
        persona.setApellido2(apellidoDos);       
        System.out.println("Digite la cedula de la persona");
        String cedula = teclado.next();
        persona.setCedula(cedula);
        
       System.out.println("Digite el curso matriculado");
        String curso = teclado.next();
        System.out.println("Digite la universidad");
        String universidad = teclado.next();
        
        Alumno estudiante = new Alumno(persona, curso, universidad);
        
        System.out.println(estudiante.toString());
        
        
        
        
        
        
       
    }
    
}
