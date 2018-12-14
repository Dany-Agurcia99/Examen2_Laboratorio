package examenlab_2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Astronautas {

    private ArrayList<Astronauta> lista_astronautas = new ArrayList();
    private File archivo = null;

    public Admin_Astronautas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Astronauta> getListaAstronautas() {
        return lista_astronautas;
    }

    public void setListaPersonas(ArrayList<Astronauta> listaPersonas) {
        this.lista_astronautas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //extras
    public void setAstronauta(Astronauta a) {
        this.lista_astronautas.add(a);
    }

    public void cargarArchivo() {
        lista_astronautas = new ArrayList();
        Astronauta temp;
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Astronauta) objeto.readObject()) != null) {
                        lista_astronautas.add(temp);

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
            for (Astronauta t : lista_astronautas) {
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
