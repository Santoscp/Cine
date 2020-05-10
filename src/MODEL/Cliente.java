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
public class Cliente extends Persona{

    public Cliente(String nombre, String direccion, int edad, String dni) {
        super(nombre, direccion, edad,dni);
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
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
    public String toString() {
        return super.toString()+"Cliente";
    }

   
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o); 
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    
    

   
    
    
}
