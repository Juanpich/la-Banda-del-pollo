public class Episodio {
    final static int MAX_CALIFICACION = 5;
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public Episodio(String titulo, String descripcion, boolean flag, int calificacion){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.flag=flag;
        setCalificacion(calificacion);
    }
    public String visto(){
        if(this.getFlag() && this.calificacion>0){
            return "Episodio: " + this.getTitulo()+ ": visto";

        }else{
            return "Episodio: " + this.getTitulo()+ ": NO visto";
        }
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
    public boolean getFlag(){
        return flag;
    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }
    public int getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(int calificacion){
        if(calificacion>0 && calificacion<=MAX_CALIFICACION){
            this.calificacion=calificacion;
        }else{
            this.calificacion=-1;
        }
    }
}
