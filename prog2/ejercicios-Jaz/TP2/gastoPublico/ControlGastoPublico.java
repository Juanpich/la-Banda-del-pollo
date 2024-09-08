public class ControlGastoPublico {
    public static void imprimir(Provincia prov){
        if (prov.provinciaDeficit()){
            System.out.println("Provincia con deficit: "+prov.getNombre());
        }
        for(int i=0; i<prov.ciudades.size(); i++){
            if(prov.ciudades.get(i).getHabitantes()>100000 && prov.ciudades.get(i).ciudadDeficit()){
                System.out.println("Ciudad con deficit: " + prov.ciudades.get(i).getNombre());
            }

        }
    }
    public static void main(String []args){
        Impuesto imp1=new Impuesto("Ganancias", 2500);
        Impuesto imp2=new Impuesto("Inmuebles", 1000);
        Impuesto imp3=new Impuesto("Vehiculos", 900);
        Impuesto imp4=new Impuesto("Luz", 1100);
        Impuesto imp5=new Impuesto("Agua", 2000);

        Ciudad c1=new Ciudad("Olavarria", 250000, 10000);
        c1.impuestos.add(imp1);
        c1.impuestos.add(imp2);
        c1.impuestos.add(imp3);
        c1.impuestos.add(imp4);
        c1.impuestos.add(imp5);

        System.out.println("C1 recaudo: " + c1.recaudadoImpuestos());

        Ciudad c2=new Ciudad("Tandil", 330000, 9000);
        c2.impuestos.add(imp1);
        c2.impuestos.add(imp2);
        c2.impuestos.add(imp3);
        c2.impuestos.add(imp4);
        c2.impuestos.add(imp5);

        Provincia prov1=new Provincia("Buenos Aires");
        prov1.ciudades.add(c1);
        prov1.ciudades.add(c2);

        imprimir(prov1);
        
    }
}