
package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Perecedero extends Producto{
    private LocalDate fechaCaducidad;

    public Perecedero() {
    }

    public Perecedero(LocalDate fechaCaducidad) {
        DateTimeFormatter abc = DateTimeFormatter.ofPattern("dd'-'MM'-'yyyy");
        fechaCaducidad = LocalDate.parse(fechaCaducidad.format(abc));
        this.fechaCaducidad = fechaCaducidad;
    }

    public Perecedero(LocalDate fechaCaducidad, String nombre, float precio) {
        super(nombre, precio);
        DateTimeFormatter abc = DateTimeFormatter.ofPattern("dd'-'MM'-'yyyy");
        fechaCaducidad = LocalDate.parse(fechaCaducidad.format(abc));
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    @Override
    public String toString() {
        return "Perecedero{" + super.toString() + "fechaCaducidad=" + fechaCaducidad + '}';
    }
    @Override
    public float calcular(int numero){
        float total = numero * precio;
        if()
        return total;
    }
    
}
