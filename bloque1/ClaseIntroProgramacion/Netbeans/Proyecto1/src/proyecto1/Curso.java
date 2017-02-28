
package proyecto1;

import java.util.*;

/**
 *
 * @author Cyberspace
 */
public class Curso {
    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private String nombre, profesor, universidad;
    int cantidadAlumno;

    public Curso() {
    }

    public ArrayList getAlumnos() {
        return listaAlumnos;
    }

    public void setAlumnos(ArrayList alumnos) {
        this.listaAlumnos = alumnos;
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
        for (int i = 0; i < listaAlumnos.size(); i++) {
            
            listaDeAlumnos += ((Alumno)listaAlumnos.get(i)).toString() +",";
            
        }
        return "Curso: " + nombre +
                "\n Profesor: " + profesor +
                "\nUniversidad: " + universidad +
                "\nLista de Alumnos : " + listaDeAlumnos   ;
    }
    
    
    public void registrar(Alumno alumno){
        listaAlumnos.add(alumno);
        
    }
    
    
    
    
}
