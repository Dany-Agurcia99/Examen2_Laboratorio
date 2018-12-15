package examenlab_2;

import java.io.Serializable;

public class Nave implements Serializable {

    int serie;
    Planeta p;
    double velocidad;
    private static final long serialVersionUID = 999L;

    public Nave() {
    }

    public Nave(int serie, Planeta p, double velocidad) {
        this.serie = serie;
        this.p = p;
        this.velocidad = velocidad;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Planeta getP() {
        return p;
    }

    public void setP(Planeta p) {
        this.p = p;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int[] CalcularTiempos(int distancia, double velocidad, int pesos) {
        int[] tiempos = new int[2];
        return tiempos;
    }
}
