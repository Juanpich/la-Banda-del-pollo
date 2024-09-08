public class Impuesto {
    String categoria;
    double valor;
    public Impuesto(String categoria,double valor){
        this.categoria=categoria;
        this.valor=valor;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public double getValor(){
        return valor;
    }
    public void setCategoria(double valor){
        this.valor=valor;
    }
}
