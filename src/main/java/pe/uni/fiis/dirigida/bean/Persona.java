package pe.uni.fiis.dirigida.bean;

/**
 * Created by rony on 24/05/15.
 */
public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String correo;

    public String getDatos(){
        String datos = null;
        datos = "Nombre: " + nombre +" Apellido Paterno: " + apellidoPaterno + " Correo: " +correo;
        return datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
