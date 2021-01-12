
package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Perecedero extends Producto{
    private LocalDate fechaCaducidad;

    public Perecedero() {
    }

    public Perecedero(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Perecedero(LocalDate fechaCaducidad, String nombre, float precio) {
        String formatoFecha = "dd-MM-yyyy"
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad..format(formatoFecha);
    }
    
    
    
}
