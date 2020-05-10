/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.logging.Logger;

/**
 *
 * @author Santos
 */
public class Pelicula implements Cloneable, Comparable<Object> {
    String nombre;
    String descripcion;
    int edad_rec;

    public Pelicula(String nombre, String descripcion, int edad_rec) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edad_rec = edad_rec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdad_rec() {
        return edad_rec;
    }

    public void setEdad_rec(int edad_rec) {
        this.edad_rec = edad_rec;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", edad_rec=" + edad_rec + '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Pelicula) {
            Pelicula aux=(Pelicula)o;
            return aux.nombre.compareTo(this.nombre);
        }

        return -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null) {
            if (this == o) {
                result = true;
            } else {

                if (o instanceof Pelicula) {
                    Pelicula aux = (Pelicula) o;
                    if (aux.nombre.equals(this.nombre)) {
                        result = true;
                    }
                }

            }
        }

        return result;
    }
    
    
    
    
    
    
    
    
}
