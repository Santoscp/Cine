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
public interface IPersona {

    String getNombre();

    void setNombre(String nombre);

    String getDireccion();

    void setDireccion(String direccion);

    int getEdad();

    void setEdad(int edad);

    String getDni();

    void setDni(String dni);

}
