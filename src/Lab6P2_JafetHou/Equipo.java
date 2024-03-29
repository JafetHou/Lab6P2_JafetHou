
package Lab6P2_JafetHou;


public class Equipo {
    
    private String pais, nombre, ciudad, estadio;

    public Equipo(String pais, String nombre, String ciudad, String estadio) {
        this.pais = pais;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }
    

    public Equipo() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
