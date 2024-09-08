public class Cliente {
    String nombre;
    Turno turno;
    int turnosOtorgados;

    public Cliente(String nombre, Turno turno){
        this.nombre=nombre;
        this.turno=turno;
        this.turnosOtorgados=0;
    }
    public void aumentarTurnos(){
        this.turnosOtorgados++;
    }
    public int getTurnosOtorgados(){
        return turnosOtorgados;
    }
    public void setTurnosOtorgados(int turnosOtorgados){
        this.turnosOtorgados=turnosOtorgados;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
