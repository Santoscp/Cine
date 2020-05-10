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
public class Sala implements Cloneable, Comparable<Object> {

    Persona[] personas;
    Asientos[] asiento;
    int numero_sala;
    Pelicula p;

    public Sala(Persona[] personas, Asientos[] asiento, int numero_sala, Pelicula p) {
        this.personas = personas;
        this.asiento = asiento;
        this.numero_sala = numero_sala;
        this.p = p;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public Asientos[] getAsiento() {
        return asiento;
    }

    public void setAsiento(Asientos[] asiento) {
        this.asiento = asiento;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    public Pelicula getPelicula() {
        return p;
    }

    public void setPelicula(Pelicula pelicula) {
        this.p = pelicula;
    }

    @Override
    public String toString() {
        return "Sala{" + "personas=" + personas + ", asiento=" + asiento + ", numero_sala=" + numero_sala + ", pelicula=" + p + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Sala obj = null;
        obj=(Sala)super.clone();
        obj.asiento=(Asientos [])obj.asiento.clone();
        obj.personas=(Persona [])obj.personas.clone();
        obj.p=(Pelicula)obj.p.clone();
        
        return obj;
                
        

    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null) {
            if (this == o) {
                result = true;
            } else {

                if (o instanceof Sala) {
                    Sala aux = (Sala) o;
                    if (aux.numero_sala == this.numero_sala) {
                        result = true;
                    }
                }

            }
        }

        return result;
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Sala) {
            Sala s = (Sala) o;
            return s.numero_sala = this.numero_sala;

        }

        return -1;
    }

}
