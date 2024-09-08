import java.util.ArrayList;
public class Provincia {
    String nombre;
    ArrayList <Ciudad> ciudades;

    public Provincia(String nombre){
        this.nombre=nombre;
        this.ciudades=new ArrayList <Ciudad>();
    }
    public boolean provinciaDeficit(){
        int contador=0;
        for (int i=0; i<ciudades.size(); i++){
            if(ciudades.get(i).getHabitantes()>100000 && ciudades.get(i).ciudadDeficit()){
                contador++;
            }
        }
        if (contador>(ciudades.size()/2)){
            return true;
        }else{
            return false;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
