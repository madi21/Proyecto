package include;

public class Periodo {
    private int id_periodo;
    private String nombre_Corto;

    public Periodo(int id_periodo, String nombre_Corto) {
        this.nombre_Corto = nombre_Corto;
    }

    public Periodo(int id_periodo) {
        this.id_periodo = id_periodo;
        this.nombre_Corto = nombre_Corto;
    }

    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public String getNombre_Corto() {
        return nombre_Corto;
    }

    public void setNombre_Corto(String nombreCorto) {
        this.nombre_Corto = nombre_Corto;
    }
}
