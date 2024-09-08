public class Turno {
    double hora;
    String fecha;
    Peluquero peluquero;

    public Turno(double hora, String fecha, Peluquero peluquero){
        this.hora=hora;
        this.fecha=fecha;
        this.peluquero=peluquero;
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
    
}
