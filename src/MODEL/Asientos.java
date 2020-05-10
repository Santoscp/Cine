/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Santos
 */
public class Asientos implements Cloneable, Comparable<Object> {

    Persona p;
    int fila;
    int columna;

    public Asientos(Persona p, int fila, int columna) {
        this.p = p;
        this.fila = fila;
        this.columna = columna;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Asientos{" + "Persona=" + p + ", fila=" + fila + ", columna=" + columna + '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Asientos) {
            Asientos aux = (Asientos) o;
            return aux.p.compareTo(this.p);
        }

        return -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Asientos obj = null;
        obj = (Asientos) super.clone();
        obj.p = (Persona) obj.p.clone();

        return obj;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null) {
            if (this == o) {
                result = true;
            } else {

                if (o instanceof Asientos) {
                    Asientos aux = (Asientos) o;
                    if (aux.columna == this.columna && aux.fila == this.fila) {
                        result = true;
                    }
                }

            }
        }

        return result;
    }

}
