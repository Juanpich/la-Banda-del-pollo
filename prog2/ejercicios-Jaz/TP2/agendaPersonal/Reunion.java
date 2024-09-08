import java.util.ArrayList;
public class Reunion {
    ArrayList <Persona> participantes;
    String lugar;
    String tema;
    double duracion;
    public Reunion(String lugar, String tema, double duracion){
        this.participantes=new ArrayList<Persona>();
        this.lugar=lugar;
        this.tema=tema;
        this.duracion=duracion;
    }
    public String getLugar(){
        return lugar;
    }
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public String getTema(){
        return lugar;
    }
    public void setTema(String tema){
        this.tema=tema;
    }
    public double getDuracion(){
        return duracion;
    }
    public void setDuracion(double duracion){
        this.duracion=duracion;
    }
    public void imprimirDatosReunion(){
        for(int i=0; i<participantes.size(); i++){
            participantes.get(i).imprimirDatosPersona();
        }
        System.out.println("Lugar: "+ this.getLugar()+" Tema: "+ this.getTema()+" Duracion: "+this.getDuracion() + " ");
    }
    public String toString(){
       return participantes.toString() + " Lugar: "+ this.getLugar()+" Tema: "+ this.getTema()+" Duracion: "+this.getDuracion() + " "; 
    }
}
