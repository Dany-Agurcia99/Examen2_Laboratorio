package examenlab_2;

public class Expedicion extends Thread {

    Nave n;
    Planeta p;
    boolean vive;
    boolean avanzar;

    public Expedicion() {
    }

    public Expedicion(Nave n, Planeta p, boolean vive, boolean avanzar) {
        this.n = n;
        this.p = p;
        this.vive = vive;
        this.avanzar = avanzar;
    }

    public Nave getN() {
        return n;
    }

    public void setN(Nave n) {
        this.n = n;
    }

    public Planeta getP() {
        return p;
    }

    public void setP(Planeta p) {
        this.p = p;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (vive == true) {
            if (avanzar == true) {

            }
        }
    }

}
