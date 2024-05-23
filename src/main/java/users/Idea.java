package users;

public class Idea {
    private String Nombre;
    private String Creador;
    private String Tipo;
    private String Importancia;


    public Idea(String Nombre, String Creador, String Tipo, String Importancia){
        this.Nombre = Nombre;
        this.Creador = Creador;
        this.Tipo = Tipo;
        this.Importancia = Importancia;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getCreador() {
        return Creador;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getImportancia() {
        return Importancia;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",getNombre(), getCreador(), getTipo(), getImportancia());
    }
    
}
