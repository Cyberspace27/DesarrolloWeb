/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamen;

import java.util.*;

/**
 *
 * @author Ariel Villarreal Calderon
 */
public class SegundoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String respuesta = "";
        
        do { 
            
        System.out.println("Programa para registrar datos de una persona");
        System.out.println("Digite el nombre de la persona");
        String nombre = teclado.nextLine();
        System.out.println("Digite el primer Apellido");
        String apellido1 = teclado.nextLine();
        System.out.println("Digite el segundo Apellido");
        String apellido2 = teclado.nextLine();
        System.out.println("Digite el # de cedula");
        String cedula = teclado.nextLine();
        System.out.println("Digite la edad de la persona");
        int edad = teclado.nextInt();
        Persona persona = new Persona(nombre, apellido1, apellido2,cedula, edad);
        
        System.out.println(persona.toString());
        
        System.out.println("1.Ejecutar \n2.Salir\n"
                + "Desea volver a registrar una persona 1.s / 2.n");
        respuesta = teclado.next();
            
        } while (respuesta.equals("s"));
        
        
       
    }
    
}
