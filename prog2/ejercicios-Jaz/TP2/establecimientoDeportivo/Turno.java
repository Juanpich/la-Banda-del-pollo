//import.java.util.LocalDate;
public class Turno {
    //LocalDate fecha;
    String fecha;
    double hora;
    Cancha cancha;
    int valor;

    public Turno(String fecha, double hora, Cancha cancha){
        this.fecha=fecha;
        this.hora=hora;
        this.cancha=cancha;
        this.valor=cancha.getPrecio();
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public double getHora(){
        return hora;
    }
    public void setHora(double hora){
        this.hora=hora;
    }
   //verifica si el turno se puede reservar.
    /*public String hacerReserva(){
        if(this.cancha.getNombre() == "Futbol" && this.cancha.descontarDisponibilidad()){
            return "Reserva hecha!";

        }else if(this.cancha.getNombre() == "Paddle" && this.cancha.descontarDisponibilidad()){
            return "Reserva hecha!";
            
        }else{
            return "No se pudo hacer la reserva, no hay disponibilidad de canchas.";
        }
    }*/
}
