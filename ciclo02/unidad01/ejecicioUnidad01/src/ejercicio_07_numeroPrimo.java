/**
 * Pedir un número, comprobar si es primo y preguntar si quiere introducir más (S/N) y volver a pensar.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio_07_numeroPrimo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean primo = false;
        String decision = "";
        do{
            int numeroDeterminado =  Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
            for(int i = 2; i <= numeroDeterminado; i++){
                if(numeroDeterminado % i == 0 ){
                    primo = false;
                }    
            }   
            if(primo == true){
                System.out.println("El " + numeroDeterminado + " Si es primo");
            }
            else{
                System.out.println("El " + numeroDeterminado + " o es primo");
            } 
            decision = (JOptionPane.showInputDialog("quieres continuar?(s/n"));
        }while(decision.equals("s") || decision.equals("S")); 
        reader.close();
    }  
}