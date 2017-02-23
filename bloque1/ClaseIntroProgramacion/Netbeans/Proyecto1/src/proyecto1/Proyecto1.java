
package proyecto1;

import java.util.*;

/**
 *
 * @author Cyberspace
 */
public class Proyecto1 {

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
