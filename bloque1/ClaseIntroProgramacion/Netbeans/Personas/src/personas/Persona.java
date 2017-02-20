
package personas;

/**
 *
 * @author Cyberspace
 */
public class Persona {
    
    private String nombre ;
    private String apellido1;
    private String apellido2;
    private int edad ;
    private String cedula;
    private String fechaDeNacimiento;

    public Persona(String nombre, String apellido1, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return " El nombre es " + nombre + " " + apellido1 +" " + apellido2 + " Tiene " + edad +"años, nacio el "+fechaDeNacimiento +" su cedula es " + cedula ;
    
    }
    
    public void calcularFechaDeNacimiento(){
        String fecha = Integer.toString(2017 - getEdad());
       setFechaDeNacimiento(fecha);
    }
    
    
}