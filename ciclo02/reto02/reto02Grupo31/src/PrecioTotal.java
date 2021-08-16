public class PrecioTotal {
    protected Double totalBalon;
    protected Double totalFutbol;
    protected Double totalVoleibol;
    protected balon[] listaBalones;

    public PrecioTotal(balon lisBalones[]){

        this.totalFutbol = 0.0;
        this.totalBalon = 0.0;
        this.totalVoleibol = 0.0;
        this.listaBalones=lisBalones;
    }

    public void mostrarTotales(){
        for(int i=0 ; i < listaBalones.length; i++){
            if(listaBalones[i] instanceof balon){
                totalBalon+=listaBalones[i].precioFinal();
            }
            if(listaBalones[i] instanceof BalonFutbol){
                totalFutbol+=listaBalones[i].precioFinal();
            }
            if(listaBalones[i] instanceof BalonVoleibol){
                totalVoleibol+=listaBalones[i].precioFinal();
            }
            }
            System.out.println("La suma del precio de los balones es de "+totalBalon);
            System.out.println("La suma del precio de los balones de futbol es de "+totalFutbol);
            System.out.println("La suma del precio de los balones de voleibol es de "+totalVoleibol);
        }

}



