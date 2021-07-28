/**
* Universidad Tecnológica de Pereira <br>
* (Pereira, Risaralda - Colombia)
* */
package utp.misiontic2022.c2.mundo ;
import java.util.Scanner;
/** 
* Clase que representa un Proyecto.
*/
public class Sistema_De_inversion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            Double pInteres = 0.0;
            Double pCapital = 0.0;
            Integer pTiempo = 0;
                System.out.println("Monto en pesos del capital invertido:");
                    pCapital = reader.nextDouble();
                System.out.println("Valor del interés a aplicar:");
                    pInteres = reader.nextDouble();                    
                System.out.println("Plazo en meses al que se realizará la inversión:");      
                    pTiempo = reader.nextInt();        
        reader.close();
        Double interesSimple = Double.valueOf(Math.round(pCapital * ( pInteres / 100 ) * pTiempo));
        Double interesCompuesto = Double.valueOf(Math.round(pCapital * ( Math.pow((1 + pInteres / 100 ), pTiempo) - 1 )));
        Double diferenciaInteres = Double.valueOf(Math.round(interesCompuesto - interesSimple));
        String compararInversion = "El interés simple es: " + interesSimple + ", el interés compuesto es: " + interesCompuesto + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " +  diferenciaInteres + ".";
        System.out.println(compararInversion);
    }  
}