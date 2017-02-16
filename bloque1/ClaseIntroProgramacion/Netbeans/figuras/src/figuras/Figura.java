
package figuras;

/**
 *
 * @author Cyberspace
 */
public class Figura {
   private int lados;
   private int ValorLado;
   private String tipo;
   private int perimetro;
   private int area;

    public Figura(int lados, int ValorLado) {
        this.lados = lados;
        this.ValorLado = ValorLado;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getValorLado() {
        return ValorLado;
    }

    public void setValorLado(int ValorLado) {
        this.ValorLado = ValorLado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
   
   
   
   
   
}
