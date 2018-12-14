package examenlab_2;

public class Planeta {

    private String nombre;
    private int temperatura;
    private String anillos;
    private String tipo_s;
    private int distancia;

    public Planeta() {
    }

    public Planeta(String nombre, int temperatura, String anillos, String tipo_s, int distancia) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.tipo_s = tipo_s;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getAnillos() {
        return anillos;
    }

    public void setAnillos(String anillos) {
        this.anillos = anillos;
    }

    public String getTipo_s() {
        return tipo_s;
    }

    public void setTipo_s(String tipo_s) {
        this.tipo_s = tipo_s;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Planeta: " + nombre;
    }

}
