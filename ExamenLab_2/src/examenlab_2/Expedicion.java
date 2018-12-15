package examenlab_2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Expedicion extends Thread {

    Nave n;
    Planeta p;
    boolean vive;
    boolean avanzar;
    JTable t;

    public Expedicion() {
    }

    public Expedicion(Nave n, Planeta p, boolean vive, boolean avanzar, JTable t) {
        this.n = n;
        this.p = p;
        this.vive = vive;
        this.avanzar = avanzar;
        this.t = t;
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
    int tiempo = 0;
    int vali = 0;

    @Override
    public void run() {
        int[] tiempos = new int[2];
        if (n instanceof Sonda) {
            tiempos = n.CalcularTiempos(p.getTemperatura(), n.getVelocidad(), 0);

        } else if (n instanceof Nave_Tripulada) {
            int pesos = 100;
            tiempos = n.CalcularTiempos(p.getTemperatura(), n.getVelocidad(), 100);
        }
        while (vive == true) {
            if (avanzar == true) {

                System.out.println(tiempos[0]);
                tiempo++;
                System.out.println(tiempo);
                if (tiempo == tiempos[0]) {
                    DefaultTableModel modelo = (DefaultTableModel) t.getModel();
                    System.out.println("hola");
                    Object[] row = new Object[3];
                    row[0] = tiempos[0];
                    row[1] = tiempos[1];
                    row[2] = "llego a su destino";
                    modelo.addRow(row);
                    t.setModel(modelo);
                    vali = 1;
                } else if (tiempo == tiempos[1] && vali == 1) {
                    DefaultTableModel modelo = (DefaultTableModel) t.getModel();
                    Object[] row = new Object[3];
                    row[0] = tiempos[0];
                    row[1] = tiempos[1];
                    row[2] = "Arrivo a casa";
                    modelo.addRow(row);
                    t.setModel(modelo);
                    avanzar = true;
                    vali = 0;
                }
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
            }
        }
    }

}
