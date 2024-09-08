//import java.util.ArrayList;

public class Futbol extends Cancha{
    public Futbol(){
        super("Futbol", 2, 400);
    }
    public String hacerReserva(Turno tn){
        if(this.descontarDisponibilidad()){
            //agrego el turno al 
            super.turnos.add(tn);
            return "Reserva hecha!";
        }else{
            //NO agrego el turno al arreglo
            return "No se pudo hacer la reserva, no hay disponibilidad de canchas.";
        }
    }
    //retorna el precio que debe pagar el Usuario (socio o no).
    public int aplicaDescuento(Usuario us){
        if (us.getSocio()){
         return this.precio-20;
        } else{
         return this.precio;
        }
     }
    //descuenta la disponibilidad cada vez que es alquilada.
     public boolean descontarDisponibilidad(){
        if (this.disponibilidad>0){
            this.disponibilidad--;
            return true;
        }
        return false;
    }
}
