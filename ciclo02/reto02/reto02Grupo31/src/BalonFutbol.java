public class BalonFutbol extends balon{

    protected static final String MARCABASE = "adidas";
    protected String marca;

    public BalonFutbol(){
        super.precio = super.PRICIOBASE;
        super.tamaño = super.TAMAÑOBASE;
        super.color = super.COLORBASE;
        this.marca = this.MARCABASE;
    }

    public BalonFutbol(Double precio, Integer tamaño){
        super.precio = precio;
        super.verificarTamaño(tamaño);
        super.color = super.COLORBASE;
        this.marca = this.MARCABASE;
    }

    public BalonFutbol(double precio, Integer tamaño, String color, String marca){
        super.precio = precio;
        super.verificarTamaño(tamaño);
        super.verificarcolor(color);
        verificarMarca(marca);
    }

    public void verificarMarca(String marca){
        String[] marcas = {"adidas","puma","golty"};
        boolean bandera = false;

        for(int i=0; i<marcas.length; i++){
            if(marcas[i].equals(marca)){
                bandera=true;
            }
        }

        if(bandera){
            this.marca=marca;
        }else{
            this.marca=MARCABASE;
        }
    }

    public Double precioFinal(){
        double adicion = 0;
        switch(this.marca){
            case "adidas":
            adicion+=50;
                break;
            case "puma":
            adicion+=30;
                break;
            case "golty":
            adicion+=70;
                break;      
        }
        return adicion+super.precioFinal();
    }

}