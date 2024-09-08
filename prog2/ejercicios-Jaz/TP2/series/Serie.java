import java.util.ArrayList;

public class Serie{
    ArrayList <Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(int canTemporadas, String titulo, String descripcion, String creador, String genero){
        this.temporadas=new ArrayList <Temporada> (canTemporadas);
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.creador=creador;
        this.genero=genero;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getCreador(){
        return creador;
    }
    public void setCreador(String creador){
        this.creador=creador;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public int getCantTemporadas(){
        return temporadas.size();
    }
    public String toString(){
        return "Serie -> Titulo: "+ this.getTitulo() + " Descripcion: "+this.getDescripcion()+" Creador: "+this.getCreador()+" Genero: "+ this.getGenero()+" Temporadas: "+ this.getCantTemporadas();
    }


}