import java.util.ArrayList;

public class Cancha{
    String nombre;
    int disponibilidad;
    int precio;
    ArrayList <Turno> turnos;

    public Cancha(String nombre, int disponibilidad,int precio){
        this.nombre=nombre;
        this.disponibilidad=disponibilidad;
        this.precio=precio;
        this.turnos=new ArrayList<Turno>();
    }
    public void getTurnos(){
        for (int i=0; i<turnos.size(); i++){
            System.out.println("Turnos "+turnos.get(i).cancha.getNombre()
                            + " " + turnos.get(i).getFecha() + " " + turnos.get(i).getHora());
        }
    }
    public String hacerReserva(Turno tn){
        return "";
    }
    public int aplicaDescuento(Usuario us){
        return 0;
    }
    public boolean descontarDisponibilidad(){
        return false;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDisponibilidad(){
        return disponibilidad;
    }
    public int getPrecio(){
        return precio;
    }
}