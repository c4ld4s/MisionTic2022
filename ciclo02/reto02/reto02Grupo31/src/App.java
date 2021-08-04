public class App {
    public static void main(String[] args){
        balon[] item1 = new balon[2];

        item1[0] = new balon(1500.0,8,"rojo");
        item1[1] = new BalonFutbol();
        
        PrecioTotal suma = new PrecioTotal(item1);
        suma.mostrarTotales();
        //balon item = new balon(1500.0,8,"rojo");

        //System.out.println(item.precioFinal());

        //BalonFutbol futbol = new BalonFutbol();
        //System.out.println(futbol.precioFinal());
    }
}
