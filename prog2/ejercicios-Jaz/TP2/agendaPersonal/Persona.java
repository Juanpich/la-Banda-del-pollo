public class Persona {
    String nombre;
    String mail;
    int numero;
    public Persona(String nombre, String mail, int numero){
        this.nombre=nombre;
        this.mail=mail;
        this.numero=numero;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void imprimirDatosPersona(){
        System.out.println( "Nombre: " + this.getNombre() + " Mail: "+ this.getMail()+ " Numero: " + this.getNumero()+ " ");
    }
    public String toString(){
        return "Nombre: " + this.getNombre() + " Mail: "+ this.getMail()+ " Numero: " + this.getNumero()+ " ";
        }
    
}
