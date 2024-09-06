package empresaturismo;

/**
 *
 * @author palco
 */
public class DatosCliente {
    
    private String nombre;
    private int rut;
    private char dv;

    public DatosCliente(String nombre, int rut, char dv) {
        this.nombre = "";
        this.rut = 0;
        this.dv = '_';
    }

    public DatosCliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }
    
    
    
}
