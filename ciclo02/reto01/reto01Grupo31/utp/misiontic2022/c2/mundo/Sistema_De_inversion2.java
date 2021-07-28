/**
* Universidad Tecnológica de Pereira <br>
* (Pereira, Risaralda - Colombia)
* */
package utp.misiontic2022.c2.mundo ;
import java.util.Scanner;
/** 
* Clase que representa un Proyecto.
*/
public class Sistema_De_inversion2 {
    
    //Variables
    Double pInteres = 0.0;
    Double pCapital = 0.0;
    Integer pTiempo = 0;

    //Atributos - Constructor
    public Sistema_De_inversion2(int tiempo, double capital, double interes){
    pTiempo = tiempo;
    pCapital = capital;
    pInteres = interes;
    }

    //Metodos
    public double intereSimple() {
        return (Math.round(pCapital * (pInteres/100)* pTiempo));
    }
    public double interesCompuesto() {
        return (Math.round(pCapital * (1 + Math.pow(pInteres/100, pTiempo)) - 1));
    }
    public double diferenciaInteres() {
        return (interesCompuesto() - intereSimple());
        }
    public String compararInversion() {
        if (intereSimple() ==  0 || interesCompuesto() == 0 ){
            return ("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");
        }
        else {
    return ("El interés simple es: " + intereSimple() + ", el interés compuesto es: " + interesCompuesto() + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferenciaInteres());
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Plazo en meses al que se realizará la inversión:");      
                Integer pTiempo = reader.nextInt();
                System.out.println("Monto en pesos del capital invertido:");
                Double pCapital = reader.nextDouble();
                System.out.println("Valor del interés a aplicar:");
                Double pInteres = reader.nextDouble();                    
        reader.close();
        Sistema_De_inversion2 app = new Sistema_De_inversion2(pTiempo , pCapital, pInteres);
        System.out.println(app.compararInversion());
        System.out.println(app.intereSimple());
        System.out.println(app.interesCompuesto());
        }
}
