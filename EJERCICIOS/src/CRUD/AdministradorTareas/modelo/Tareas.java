package CRUD.AdministradorTareas.modelo;

public class Tareas {

    private int id_tarea;
    private int id_incremental = 0;
    private String descripción;
    private String fecha_vencimiento;
    private String estado;

    public Tareas(){

    }

    public Tareas(String descripción, String fecha_vencimiento, String estado){
        this.id_tarea = id_incremental;
        id_incremental+=1;
        this.descripción = descripción;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
