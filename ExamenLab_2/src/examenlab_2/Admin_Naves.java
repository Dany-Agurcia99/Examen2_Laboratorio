package examenlab_2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Naves {

    private ArrayList<Nave> lista_Naves = new ArrayList();
    private File archivo = null;

    public Admin_Naves(String path) {
        archivo = new File(path);
    }

    public ArrayList<Nave> getLista_Naves() {
        return lista_Naves;
    }

    public void setLista_Naves(ArrayList<Nave> lista_Naves) {
        this.lista_Naves = lista_Naves;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //extras
    public void setNave(Nave n) {
        this.lista_Naves.add(n);
    }

    public void cargarArchivo() {
        lista_Naves = new ArrayList();
        Nave temp;
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Nave) objeto.readObject()) != null) {
                        lista_Naves.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Nave t : lista_Naves) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
