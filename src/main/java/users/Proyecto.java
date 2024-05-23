package users;

public class Proyecto {
    private String Nombre;
    private Integer Participantes;
    private String Proceso;
    private String Importancia;


    public Proyecto(String Nombre, Integer Participantes, String Proceso, String Importancia){
        this.Nombre = Nombre;
        this.Participantes = Participantes;
        this.Proceso = Proceso;
        this.Importancia = Importancia;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public Integer getParticipantes() {
        return Participantes;
    }

    public String getProceso() {
        return Proceso;
    }

    public String getImportancia() {
        return Importancia;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",getNombre(), getParticipantes(), getProceso(), getImportancia());
    }
    
}
