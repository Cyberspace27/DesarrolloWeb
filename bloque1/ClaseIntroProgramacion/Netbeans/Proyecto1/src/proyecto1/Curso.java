
package proyecto1;

import java.util.*;

/**
 *
 * @author Cyberspace
 */
public class Curso {
    private ArrayList alumnos = new ArrayList();
    private String nombre, profesor, universidad;
    

    public Curso() {
    }

    public ArrayList getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        
        String listaDeAlumnos = "";
        for (int i = 0; i < alumnos.size(); i++) {
            
            listaDeAlumnos += ((Alumno)alumnos.get(i)).toString() +",";
            
        }
        return "Curso: " + nombre +
                "\n Profesor: " + profesor +
                "\nUniversidad: " + universidad +
                "\nLista de Alumnos : " + listaDeAlumnos   ;
    }
    
    
    public void registrar(Alumno alumno){
        alumnos.add(alumno);
        
    }
    
    
    
    
}
