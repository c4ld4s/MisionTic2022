public class BalonVoleibol extends balon{

    protected static final String SUELOBASE = "indefinido";
    protected String suelo;

    public BalonVoleibol(){
        super.precio = super.PRICIOBASE;
        super.tamaño = super.TAMAÑOBASE;
        super.color = super.COLORBASE;
        this.suelo = this.SUELOBASE;
    }

    public BalonVoleibol(Double precio, Integer tamaño){
        super.precio = precio;
        super.verificarTamaño(tamaño);
        super.color = super.COLORBASE;
        this.suelo = this.SUELOBASE;
    }    

    public BalonVoleibol(double precio, Integer tamaño, String color, String suelo){
        super.precio = precio;
        super.verificarTamaño(tamaño);
        super.verificarcolor(color);
        verificarSuelo(suelo);
    }

    public void verificarSuelo(String suelo){
        String[] suelos = {"indefinido","exteriores","interiores"};
        boolean bandera = false;

        for(int i=0; i<suelos.length; i++){
            if(suelos[i].equals(suelo)){
                bandera=true;
            }
        }

        if(bandera){
            this.suelo=suelo;
        }else{
            this.suelo=SUELOBASE;
        }
    }

    public Double precioFinal(){
        double adicion = 0;
        switch(this.suelo){
            case "indefinido":
            adicion+=20;
                break;
            case "interiores":
            adicion+=30;
                break;      
            case "exteriores":
            adicion+=50;
                break;
        }
        return adicion+super.precioFinal();
    }

}
