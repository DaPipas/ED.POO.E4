
package clases;

public class NoPerecedero extends Producto{
    private String tipo;

    public NoPerecedero() {
    }

    public NoPerecedero(String tipo) {
        this.tipo = tipo;
    }

    public NoPerecedero(String tipo, String nombre, float precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    @Override
    public String toString() {
        return "NoPerecedero{" + super.toString()+ "tipo=" + tipo + '}';
    }
    
    public float calcular(int numero){
        float total = numero * precio;
        return total;
    }
    
    
    
}
