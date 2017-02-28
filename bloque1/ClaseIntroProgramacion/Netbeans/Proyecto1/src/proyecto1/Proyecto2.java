/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author ariel.villarreal
 */

import java.util.*;
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
      
      Alumno alumno = new Alumno();
      
      alumno.setNombre("Ariel");
      alumno.setApellido("Villarre");
      alumno.setCarnet("323434244");
      
      Curso curso = new Curso();
      curso.setNombre("Programacion");
      curso.setProfesor("Jirafales");
      curso.setUniversidad("UPI");
      curso.registrar(alumno);
      System.out.println(curso.toString());
    }
    
}
