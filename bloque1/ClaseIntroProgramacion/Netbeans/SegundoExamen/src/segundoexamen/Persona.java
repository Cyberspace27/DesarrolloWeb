
package segundoexamen;

/**
 *
 * @author Ariel Villarreal calderon
 */
public class Persona {
    
    private String nombre, apellido1, apellido2, cedula;
    
    private int edad, fechaDeNacimiento;

    public Persona(String nombre, String apellido1, String apellido2, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.edad = edad;
        this.calcularFechaNacimiento();
        
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void calcularFechaNacimiento(){
        int fecha = 2017 - getEdad();
       setFechaDeNacimiento(fecha);
       
    }
    
    @Override
    public String toString() {
       return " El nombre es " + nombre + " " + apellido1 +" " + apellido2 + " Tiene " + edad +"años, nacio el "+fechaDeNacimiento +" su cedula es " + cedula ;
    }
   
    
    
    
}
