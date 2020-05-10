
package MODEL;

import java.util.TreeSet;
import java.util.Set;


public class Data {
    
    private static final Data INSTANCE = new Data();
    protected Set<Persona> personas;
    protected Set<Sala> sala;
    protected Set<Pelicula> pelicula;
    protected Set<Asientos> asiento;

    private Data() {
        this.personas = new TreeSet<>();
        this.sala = new TreeSet<>();
        this.pelicula = new TreeSet<>();
        this.asiento=new TreeSet<>();
    }
    
    public static Data getInstance(){
        return Data.INSTANCE;
    }
    

    public Set<Persona> getPersonas() {
        return personas;
    }

    public Set<Sala> getSala() {
        return sala;
    }

    public Set<Pelicula> getPelicula() {
        return pelicula;
    }
    
    public Set<Asientos> getAsientos(){
        return asiento;
    }
    
    
}
