package users;

public class Tarea {
    private String Nombre;
    private String Usuario;
    private String Proceso;
    private String Importancia;


    public Tarea(String Nombre, String Usuario, String Proceso, String Importancia){
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Proceso = Proceso;
        this.Importancia = Importancia;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getProceso() {
        return Proceso;
    }

    public String getImportancia() {
        return Importancia;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",getNombre(), getUsuario(), getProceso(), getImportancia());
    }
    
}
