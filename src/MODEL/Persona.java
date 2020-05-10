/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Objects;

/**
 *
 * @author Santos
 */
public abstract class Persona implements IPersona, Cloneable, Comparable<Object> {

    String nombre;
    String direccion;
    int edad;
    String dni;

    public Persona(String nombre, String direccion, int edad, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null) {
            if (this == o) {
                result = true;
            } else {

                if (o instanceof Persona) {
                    Persona aux = (Persona) o;
                    if (aux.dni.equals(this.dni)) {
                        result = true;
                    }
                }

            }
        }

        return result;

    }

    @Override
    public  int compareTo(Object o){
     if (o == this) {
            return 0;
        }
        if (o instanceof Persona) {
            Persona aux=(Persona)o;
            return aux.nombre.compareTo(this.nombre);
        }

        return -1;   
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    

}
