public class App {
    public static void main(String[] args){

        balon intem[]=new balon[5];
        intem[0]=new balon();
        intem[1]=new BalonFutbol();
        intem[2]=new BalonVoleibol();
        intem[3]=new balon();
        intem[4]=new BalonFutbol();
        
        PrecioTotal analisis1 = new PrecioTotal(intem);
        analisis1.mostrarTotales();
    }
}
