
package personas;

/**
 *
 * @author Cyberspace
 */
public class Alumno {
    private Persona persona;
    private String curso;
    private String universidad;

    public Alumno(Persona persona, String curso, String universidad) {
        this.persona = persona;
        this.curso = curso;
        this.universidad = universidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return persona.toString() + ". Esta matriculando en el curso " + curso + "de la Universidad " + universidad;
    }
    
    
    
    
}
