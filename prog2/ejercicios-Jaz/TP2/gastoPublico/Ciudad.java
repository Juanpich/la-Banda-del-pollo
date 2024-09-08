import java.util.ArrayList;

public class Ciudad {
    String nombre;
    int habitantes;
    double gastoMantenimiento;
    ArrayList <Impuesto> impuestos;
    double montoRecaudado;
    
    public Ciudad(String nombre, int habitantes,double gastoMantenimiento){
        this.nombre=nombre;
        this.habitantes=habitantes;
        this.gastoMantenimiento=gastoMantenimiento;
        this.impuestos=new ArrayList <Impuesto>();
        this.montoRecaudado=recaudadoImpuestos();
    }
    public boolean ciudadDeficit(){
        if(gastoMantenimiento>montoRecaudado){
            return true;
        }else{
            return false;
        }
    }
    public double recaudadoImpuestos(){
        double suma=0;
        for (int i=0; i<impuestos.size(); i++){
            suma+= impuestos.get(i).getValor();
        }
        return suma;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getHabitantes(){
        return habitantes;
    }
    public void setHabitantes(int habitantes){
        this.habitantes=habitantes;
    }
    public double getGasto(){
        return gastoMantenimiento;
    }
    public void setGasto(double gastoMantenimiento){
        this.gastoMantenimiento=gastoMantenimiento;
    }
}
