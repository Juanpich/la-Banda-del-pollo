import java.util.ArrayList;

public class RegistroSocios {
   ArrayList <Usuario> socios; 
   final static int DEF_TURNOS_MINIMOS=4;

   public RegistroSocios(){
      this.socios=new ArrayList<Usuario>();
   }
   //hace o no socio al Usuario.
   public boolean hacerSocio(Usuario us){
      if (us.getCantTurnos()>=DEF_TURNOS_MINIMOS){
         socios.add(us);
         return true;
      }else{
         return false;
      }
   }
   //verifica si el Usuario esta o no el arreglo (socio o no).
   public boolean esSocio (Usuario us){
      boolean es=false;
      int i=0;
      while(i<socios.size() && !es){
         es=socios.get(i).equals(us);
         i++;
      }
      return es;
   }
}
