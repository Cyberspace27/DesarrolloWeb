
package proyecto1;

import java.util.*;

/**
 *
 * @author Cyberspace
 */
public class Proyecto1 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      String opcion = "";
      String nombre,apellido,carnet = "";
      int accion=0;
      ArrayList listaAlmunos = new ArrayList();
      
       
        Curso curso = new Curso();
        
        
      do {            
      
            Alumno alumno = new Alumno();
       
        System.out.println("Programa para Registrar Alumnos");
        System.out.println("---------------------------------");
        System.out.println("1.Crear Alumno \n2.Crear Curso \n3.Registrar\n"
                + "Digite la opcion a Realizar ");
        accion = teclado.nextInt();
        teclado.nextLine();
        if(accion==1){
            System.out.println("Digite el nombre del alumno");
            alumno.setNombre(teclado.nextLine());
            System.out.println("Digite el Apellido");
            alumno.setApellido(teclado.nextLine());
            System.out.println("Digite el #Carnet ");
            alumno.setCarnet(teclado.nextLine());
            listaAlmunos.add(alumno);
        }else if (accion==2){
            System.out.println("Digite el nombre del Curso");
            curso.setNombre(teclado.nextLine());
            System.out.println("Digite el nombre del Profesor");
            curso.setProfesor(teclado.nextLine());
            System.out.println("Digite el nombre de la Universidad");
            curso.setUniversidad(teclado.nextLine());
        }else{
            
            for (int i = 0; i < listaAlmunos.size(); i++) {
                
                curso.registrar((Alumno)listaAlmunos.get(i));
            }
            System.out.println(curso.toString());
           
            
        }            
        System.out.println("1.Ejecutar \n2.Salir\n"
                + "Desea Continuar 1.s / 2.n");
        opcion = teclado.nextLine();
        } while (opcion.equals("s"));
      
      
      
      
      
      
    }
    
}
