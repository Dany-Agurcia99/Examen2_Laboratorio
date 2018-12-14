package examenlab_2;

import java.io.Serializable;

public class Astronauta implements Serializable {

    String nombre;
    String nacionalidad;
    int sueldo;
    String sexo;
    int peso;
    int experiencia;
    private static final long serialVersionUID = 777L;

    public Astronauta() {
    }

    public Astronauta(String nombre, String nacionalidad, int sueldo, String sexo, int peso, int experiencia) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.sexo = sexo;
        this.peso = peso;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
