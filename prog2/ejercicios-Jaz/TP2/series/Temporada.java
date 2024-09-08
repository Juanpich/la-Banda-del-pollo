import java.util.ArrayList;

public class Temporada {
    
   ArrayList <Episodio> episodios;
    int cantEpisodios;
    String nombre;


    public Temporada(int cantEpisodios, String nombre){
        this.episodios = new ArrayList <Episodio> (cantEpisodios);
        this.nombre=nombre;
    }
    public int getCantEpisodios(){
        return episodios.size();
    }
    public void setEpisodio(Episodio ep){
        episodios.add(ep);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String toString(){
        return "Temporada -> " + this.getNombre()+ " Cantidad de episodios de: "+ this.getCantEpisodios();
    }
}
