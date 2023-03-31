package CochesEjercicio;

public class Coche {

    // perfil y caracteristicas del coche

    String color;
    String modelo;
    int cilindraje;
    boolean nuevo;
    String placas;
    double precio;

    public Coche(){

    }

    public Coche(String color, String modelo, int cilindraje, boolean nuevo, String placas, double precio) {
        this.color = color;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.nuevo = nuevo;
        this.placas = placas;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindraje=" + cilindraje +
                ", nuevo=" + nuevo +
                ", placas='" + placas + '\'' +
                ", precio=" + precio +
                '}';
    }
}
