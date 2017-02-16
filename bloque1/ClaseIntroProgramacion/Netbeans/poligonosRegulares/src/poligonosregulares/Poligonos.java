
package poligonosregulares;

/**
 *
 * @author Cyberspace
 */

public class Poligonos {
 
    private int cantidadDeLados;
    private int medidaDeLado;
    private double medidaDeAngulo;
    private int perimetro;
    private String tipoDeFigura;

    public Poligonos(int cantidadDeLados, int medidaDeLado) {
        this.cantidadDeLados = cantidadDeLados;
        this.medidaDeLado = medidaDeLado;
        
        this.calcularPerimetro();
        this.calcularAngulos();
        this.calcularTipo();
    }

    public int getCantidadDeLados() {
        return cantidadDeLados;
    }

    public void setCantidadDeLados(int cantidadDeLados) {
        this.cantidadDeLados = cantidadDeLados;
    }

    public int getMedidaDeLado() {
        return medidaDeLado;
    }

    public void setMedidaDeLado(int medidaDeLado) {
        this.medidaDeLado = medidaDeLado;
    }

    public double getMedidaDeAngulo() {
        return medidaDeAngulo;
    }

    public void setMedidaDeAngulo(double medidaDeAngulo) {
        this.medidaDeAngulo = medidaDeAngulo;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public String getTipoDeFigura() {
        return tipoDeFigura;
    }

    public void setTipoDeFigura(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }
    
    public void calcularPerimetro(){
        int perimetro = getCantidadDeLados() * getMedidaDeLado();
        setPerimetro(perimetro);
        
    }
    
    public void calcularAngulos(){
        int angulos = 360 / getCantidadDeLados();
        setMedidaDeAngulo(angulos);
    
    }
    public void calcularTipo(){
        System.out.println("Esto probando aqui " + getCantidadDeLados());
            if (getCantidadDeLados()==3) {
                
            setTipoDeFigura("Triangulo");
        } else if (getCantidadDeLados()==4) {
            setTipoDeFigura("Cuadrado");
        } else if (getCantidadDeLados()==5) {
            setTipoDeFigura("Pentagono");
        }else if (getCantidadDeLados()==6) {
            setTipoDeFigura("Hexagono");
        }else if (getCantidadDeLados()==7) {
            setTipoDeFigura("Heptagono");
        }else if (getCantidadDeLados()==8) {
            setTipoDeFigura("Octagono");
        } else{
            setTipoDeFigura("muy Grande");
            
        }
    }

    @Override
    public String toString() {
        return "Esta figura es un " + tipoDeFigura + ", tiene " + cantidadDeLados + " lados, cada lado mide " 
                + medidaDeLado + ", sus angulos miden " + medidaDeAngulo + "grados , su perimetro mide " + perimetro;
    }
    
    
    
}
