import java.util.ArrayList;

public class Peluquero {
    String nombre;
    int disponibilidadPorDia;
    ArrayList <Turno> turnos;

    public Peluquero(String nombre, int disponibilidadPorDia){
        this.nombre=nombre;
        this.disponibilidadPorDia=disponibilidadPorDia;
        this.turnos=new ArrayList<Turno>(disponibilidadPorDia);
    }
    public String asignarTurno(Turno t1, Cliente c){
        if (turnos.size()>=0 && turnos.size()<disponibilidadPorDia && t1.getHora()>=16 && t1.getHora()<=20){
            turnos.add(t1);
            c.aumentarTurnos();
            return "Turno asignado! Turno: " + t1.getFecha()+ "  "+t1.getHora();
        }else{
            return "El turno no se pudo asignar!";
        }
    }
    public String getTurnosDisponibles(){
        if(turnos.size()<this.disponibilidadPorDia){
            return "A "+ this.getNombre()+ " le quedan "+ (this.disponibilidadPorDia-turnos.size()) + " turnos disponibles!";
        }else{
            return "A "+ this.getNombre()+ " NO le quedan turnos disponibles!";
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getDisponibilidadPorDia(){
        return disponibilidadPorDia; 
    }
}
