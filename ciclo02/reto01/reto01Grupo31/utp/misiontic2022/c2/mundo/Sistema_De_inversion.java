/**
* Universidad Tecnológica de Pereira <br>
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
        Double interesSimple = (double) Math.round(this.capital*(this.interes/100)*this.tiempo);
        return (interesSimple);
    }
    public Double interesCompuesto()
    {
        Double interesCompuesto = (double) (Math.round(this.capital*(Math.pow(1+(this.interes/100), this.tiempo)-1)));
        return(interesCompuesto);
    }
    public String compararInversion(Double interesCompuesto, Double interesSimple)
    {   
        String diferencia ="";
        if (interesSimple == 0 || interesCompuesto == 0)
        {
            diferencia = "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto";
        }
        else
        {
            diferencia = "El interés simple es: " + this.interesSimple() +", el interés compuesto es:" + this.interesCompuesto() + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " + (this.interesCompuesto() - this.interesSimple()) + ".";
        }
        return (diferencia);
    }
}