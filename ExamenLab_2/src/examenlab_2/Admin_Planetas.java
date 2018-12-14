package examenlab_2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Planetas {

    private ArrayList<Planeta> lista_planetas = new ArrayList();
    private File archivo = null;

    public Admin_Planetas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planeta> getListaPlanetas() {
        return lista_planetas;
    }

    public void setListaPersonas(ArrayList<Planeta> listaPersonas) {
        this.lista_planetas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //extras
    public void setPlaneta(Planeta p) {
        this.lista_planetas.add(p);
    }

    public void cargarArchivo() {
        lista_planetas = new ArrayList();
        Planeta temp;
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Planeta) objeto.readObject()) != null) {
                        lista_planetas.add(temp);
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
            for (Planeta t : lista_planetas) {
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
