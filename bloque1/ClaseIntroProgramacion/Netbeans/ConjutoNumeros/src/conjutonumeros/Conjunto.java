
package conjutonumeros;

import java.util.ArrayList;

/**
 *
 * @author Cyberspace
 */
public class Conjunto {
   private ArrayList grupo;
   private double promedio;
   private double sumatoria;

    public Conjunto(ArrayList grupo) {
        this.grupo = grupo;
        
        this.calcularSumatoria();
        this.calcularPromedio();
    }

    public ArrayList getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList grupo) {
        this.grupo = grupo;
    }

      public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
        System.out.println("Promedio prueba "+ promedio);
    }

  
   public void calcularSumatoria(){
        double suma = 0;
        for (int i =0;i < grupo.size() ; i++) {
            suma += (Integer)grupo.get(i);    
            
        }
        setSumatoria(suma);
    }
     
    
    public void calcularPromedio() {
        
        setPromedio(getSumatoria() / grupo.size());
    }
     
   
   
    
    @Override
    public String toString() {
        
        return "El Conjuto de numero es  " + getGrupo()+ " la suma es igual a " + sumatoria +" Y el promedio es = "+ promedio ;
    }
    
    
    
}
