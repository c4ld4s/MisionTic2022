public class balon {
    protected static final Double PRICIOBASE = 100.0;
    protected static final Integer TAMAÑOBASE = 1;
    protected static final String COLORBASE="negro";

    protected Double precio;
    protected Integer tamaño;
    protected String color;

    public balon(){
        this.precio=PRICIOBASE;
        this.color=COLORBASE;
        this.tamaño=TAMAÑOBASE;
    }
    public balon(Double precio, String color){
        this.precio=precio;
        this.tamaño=TAMAÑOBASE;
        verificarcolor(color);
    }
    public balon(Double precio,Integer tamaño, String color){
        this.precio=precio;
        verificarcolor(color);
        verificarTamaño(tamaño);
    }

    public void verificarcolor(String color){
        String[] colores = {"negro","cafe","blanco","rojo"};
        boolean bandera = false;

        for(int i=0; i<colores.length; i++){
            if(colores[i].equals(color)){
                bandera=true;
            }
        }

        if(bandera){
            this.color=color;
        }else{
            this.color=COLORBASE;
        }
    }

    public void verificarTamaño(int tamaño){
        if(tamaño >= 1 && tamaño <=6){
            this.tamaño = tamaño;
        }else{
            this.tamaño=TAMAÑOBASE;
        }
    }

    public Double precioFinal(){
        double adicion = 0;
        switch(color){
            case "negro":
            adicion+=100;
                break;
            case "cafe":
            adicion+=80;
                break;
            case "blanco":
            adicion+=70;
                break;    
            case "rojo":
            adicion+=50;
                break;    
        }

        if(tamaño==1){
            adicion+=200;
        }
        else if(tamaño==2){
            adicion+=300;
        }
        else if(tamaño==3){
            adicion+=400;            
        }
        else if(tamaño==4){
            adicion+=500;            
        }
        else if(tamaño==5){
            adicion+=600;            
        }
        else if(tamaño==6){
            adicion+=700;
        }
        return this.precio+adicion;
    }
    
    public void setPrecio (Double precio) {
        this.precio=precio;
    }

    public Double getPrecio(){
        return this.precio;
    }

    public Double getPRECIO(){
        return this.PRICIOBASE;
    }
}
