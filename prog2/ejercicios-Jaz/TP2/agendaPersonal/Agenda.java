import java.util.ArrayList;

public class Agenda{
    ArrayList <Reunion> reuniones;
    public Agenda(){
        reuniones=new ArrayList<Reunion>();
    }
    public void imprimirDatosAgenda(){
        System.out.println("La agenda imprime: ");
        for (int i=0; i<reuniones.size(); i++){
             reuniones.get(i).imprimirDatosReunion();
        }
    }
    public String toString(){
        return reuniones.toString();
    }
}