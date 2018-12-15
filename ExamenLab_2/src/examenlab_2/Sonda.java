package examenlab_2;

public class Sonda extends Nave {

    String Material;
    int peso;

    public Sonda() {
    }

    public Sonda(String Material, int peso) {
        this.Material = Material;
        this.peso = peso;
    }

    public Sonda(String Material, int peso, int serie, Planeta p, double velocidad) {
        super(serie, p, velocidad);
        this.Material = Material;
        this.peso = peso;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

    @Override
    public int[] CalcularTiempos(int distancia, double velocidad, int pesos) {
        int[] tiempos = new int[2];
        tiempos[0] = (int) (distancia / velocidad);
        tiempos[1] = (int) (9.8 * velocidad);
        return tiempos;
    }

}
