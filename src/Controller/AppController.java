/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import MODEL.Asientos;
import MODEL.Cliente;
import MODEL.Critico;
import MODEL.Data;
import MODEL.Pelicula;
import MODEL.Persona;
import MODEL.Sala;
import MODEL.Sub;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Santos
 */
public class AppController {

    public boolean createCliente(String nombre, String direccion, int edad, String dni) {

        Cliente cli = new Cliente(nombre, direccion, 0, dni);

        return Data.getInstance().getPersonas().add(cli);

    }

    public boolean createSub(String nombre, String direccion, int edad, String dni) {

        Sub sub = new Sub(nombre, direccion, 0, dni);

        return Data.getInstance().getPersonas().add(sub);

    }

    public boolean createCritico(String nombre, String direccion, int edad, String dni) {

        Critico cri = new Critico(nombre, direccion, 0,dni);

        return Data.getInstance().getPersonas().add(cri);

    }

    public boolean createPelicula(String nombre, String descripcion, int edad_rec) {

        Pelicula p = new Pelicula(nombre, descripcion, edad_rec);

        return Data.getInstance().getPelicula().add(p);

    }

    public boolean createSala(Persona[] personas, Asientos[] asiento, int numero_sala, Pelicula pelicula) {
        Sala s = new Sala(personas, asiento, numero_sala, pelicula);
        return Data.getInstance().getSala().add(s);
    }

    public boolean createAsientos(Persona p, int fila, int columna) {
        Asientos as = new Asientos(p, fila, columna);
        return Data.getInstance().getAsientos().add(as);
    }

 
    public boolean editCliente(Cliente e, Cliente newe) {
        boolean result = false;
        Set<Persona> lista = Data.getInstance().getPersonas();
        if (lista.contains(e)) {
            e.setDireccion(newe.getDireccion());
            e.setDni(newe.getDni());
            e.setEdad(newe.getEdad());
            e.setNombre(newe.getNombre());

            result = true;

        }
        return result;
    }
    public boolean editCritico(Critico c, Critico newc) {
        boolean result = false;
        Set<Persona> lista = Data.getInstance().getPersonas();
        if (lista.contains(c)) {
            c.setDireccion(newc.getDireccion());
            c.setDni(newc.getDni());
            c.setEdad(newc.getEdad());
            c.setNombre(newc.getNombre());

            result = true;

        }
        return result;
    }
    public boolean editSubcriptor(Sub s, Sub news) {
        boolean result = false;
        Set<Persona> lista = Data.getInstance().getPersonas();
        if (lista.contains(s)) {
            s.setDireccion(news.getDireccion());
            s.setDni(news.getDni());
            s.setEdad(news.getEdad());
            s.setNombre(news.getNombre());

            result = true;

        }
        return result;
    }
    public boolean editAsientos(Asientos as, Asientos newas){
        boolean result=false;
        Set<Asientos> lista=Data.getInstance().getAsientos();
        
        if(lista.contains(as)){
            as.setColumna(newas.getColumna());
            as.setFila(newas.getFila());
            as.setP(newas.getP());
            result=true;
        }
        return result;
    }
    public boolean editPelicula(Pelicula p,Pelicula newp){
        boolean result=false;
        Set<Pelicula> lista=Data.getInstance().getPelicula();
        if(lista.contains(p)){
            p.setDescripcion(newp.getDescripcion());
            p.setEdad_rec(newp.getEdad_rec());
            p.setNombre(newp.getNombre());
            result=true;
        }
        return result;
    }
    public boolean editSala(Sala s, Sala newsa){
        boolean result=false;
        Set<Sala> lista=Data.getInstance().getSala();
        if(lista.contains(s)){
            s.setAsiento(newsa.getAsiento());
            s.setNumero_sala(newsa.getNumero_sala());
            s.setPelicula(newsa.getPelicula());
            s.setPersonas(newsa.getPersonas());
            result=true;
        }
        return result;
    }
    public boolean deleteCliente(String nombre){
         boolean result = false;
        Set<Persona> A = Data.getInstance().getPersonas();
        for(Persona lista: A){
            if(lista.getNombre().equals(nombre)){
                lista=null;
                result=true;
            }
        }
        
       

        return result;
        
    }
    public boolean deletePelicula(String nombre){
         boolean result = false;
        Set<Pelicula> A = Data.getInstance().getPelicula();
        for(Pelicula lista: A){
            if(lista.getNombre().equals(nombre)){
                lista=null;
                result=true;
            }
        }
        
       

        return result;
        
    }
    public boolean deleteAsiento(int fila, int columna){
         boolean result = false;
        Set<Asientos> A = Data.getInstance().getAsientos();
        for(Asientos lista: A){
            if(lista.getColumna()==columna && lista.getFila()== fila){
                lista=null;
                result=true;
            }
        }
        
       

        return result;
        
    }
    public boolean deleteSala(int numero){
         boolean result = false;
        Set<Sala> A = Data.getInstance().getSala();
        for(Sala lista: A){
            if(lista.getNumero_sala()==numero){
                lista=null;
                result=true;
            }
        }
        
       

        return result;
        
    }
    
}
