
package proyecto1;

/**
 *
 * @author Cyberspace
 */
public class Alumno {
   private String nombre;
   private String apellido;
   private String carnet ;
  

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "\nNombre " + nombre +
                "\nApellido " +apellido+ 
                "\nCarnet " +carnet 
                ;
    }
   
   
    
}
