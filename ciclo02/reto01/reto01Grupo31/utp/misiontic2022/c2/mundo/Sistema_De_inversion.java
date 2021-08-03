/**
* Universidad Tecnológica de Pereira
* (Pereira, Risaralda - Colombia)
* */
package utp.misiontic2022.c2.mundo ;


/** 
* Clase que representa un Proyecto.
*/

public class Sistema_De_inversion {
    private Integer tiempo;
    private Double capital;
    private Double interes;

    public Sistema_De_inversion()
    {
        this.tiempo=0;
        this.capital=0.0;
        this.interes=0.0;
    }
    public Sistema_De_inversion(Integer pTiempo, Double pCapital, Double pInteres)
    {
        this.tiempo=pTiempo;
        this.capital=pCapital;
        this.interes=pInteres;
    }
    public Double interesSimple()
    {   
        Double a = (double) Math.round(this.capital*(this.interes/100)*this.tiempo);
        return (a);
    }
    public Double interesCompuesto()
    {
        Double b = (double) this.capital*(Math.pow(1+(this.interes/100), this.tiempo)-1);
        return(b);
    }
    public void compararInversion(Double b, Double a)
    {   
        if ((a != 0) && (b != 0))
        {
            System.out.println("El interés simple es: " + a +", el interés compuesto es: " + b + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " + (b-a));
        }
        else
        {
            System.out.println("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto");
        }
    }

    public static void main(String[] args){
        Sistema_De_inversion a = new Sistema_De_inversion(36,350000.0,1.18);
        Double b = a.interesSimple();
        Double c = a.interesCompuesto();
        a.compararInversion(c, b);
    }
}