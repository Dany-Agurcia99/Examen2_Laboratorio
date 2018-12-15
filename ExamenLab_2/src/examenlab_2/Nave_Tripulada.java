package examenlab_2;

import java.util.ArrayList;

public class Nave_Tripulada extends Nave {

    String lugar_despeje;
    ArrayList<Astronauta> lista_astro = new ArrayList();

    public Nave_Tripulada() {
    }

    public Nave_Tripulada(String lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public Nave_Tripulada(String lugar_despeje, int serie, Planeta p, double velocidad) {
        super(serie, p, velocidad);
        this.lugar_despeje = lugar_despeje;
    }

    public String getLugar_despeje() {
        return lugar_despeje;
    }

    public void setLugar_despeje(String lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public ArrayList<Astronauta> getLista_astro() {
        return lista_astro;
    }

    public void setLista_astro(ArrayList<Astronauta> lista_astro) {
        this.lista_astro = lista_astro;
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
        tiempos[0] = (int) (distancia / (velocidad * ((pesos * pesos) / 100)));
        tiempos[1] = (int) (distancia / (velocidad * (pesos / 100)));
        return tiempos;
    }

}
