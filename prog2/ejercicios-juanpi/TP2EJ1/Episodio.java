package TP2EJ1;
public class Episodio {
    String titulo;
    String descripcion;
    boolean visto;
    int calificacion;
    public Episodio(String titulo, String descripcion, boolean visto, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        if (visto) {
            this.calificacion=calificacion; 
        }else{
            this.calificacion=-1;
        }
        
    }
    public int getCalificacion(){
        return this.calificacion;
    }
    public boolean getVisto(){
        return visto;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPuntuacionVisto(int calificacionCargada, boolean visto){
        if(visto){
            if(calificacionCargada <=0){
                this.calificacion=1;
            }else if(calificacionCargada >= 6){
                this.calificacion=5;
            }else{
                this.calificacion=calificacionCargada;
            }
        }else{
            this.calificacion=-1;
        }
        this.visto = visto;
    }
}
 