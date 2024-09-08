public class Usuario {
    String nombre;
    Turno turno;
    int cantTurnos;
    boolean socio;

    public Usuario(String nombre,Turno turno, int cantTurnos){
        this.nombre=nombre;
        this.turno=turno;
        //this.turnos=new ArrayList<Turno>();
        this.socio=false;
        this.cantTurnos=cantTurnos;
    }
    public int getCantTurnos(){
        return cantTurnos;
    }
    public void setCantTurnos(int cantTurnos){
        this.cantTurnos=cantTurnos;
    }
    public boolean getSocio(){
        return socio;
    }
    public void setSocio(boolean es){
        this.socio=es;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
