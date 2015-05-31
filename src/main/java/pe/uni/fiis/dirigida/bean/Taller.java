package pe.uni.fiis.dirigida.bean;

import java.util.List;

/**
 * Created by rony on 25/05/15.
 */
public class Taller {
    private String nombre;
    private List<Persona> personas;

    public void mostrarDatosPersonas(){
        if(personas != null && personas.size() > 0){
            for (int i = 0; i < personas.size(); i++) {
                System.out.println(personas.get(i).getDatos());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
