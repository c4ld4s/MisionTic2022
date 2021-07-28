/**
 * Pedir un número, comprobar si es primo y preguntar si quiere introducir más (S/N) y volver a pensar.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio_06_pesoIdeal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sexo = (JOptionPane.showInputDialog("Digita su sexo (H/M)"));
        int altura =  Integer.parseInt(JOptionPane.showInputDialog("Digita su altura en centimetros: "));
        reader.close();
        if(sexo == "H" || sexo == "h"){
        int pesoIdealHombre = altura - 110;
        System.out.println("Su peso ideal es de " + pesoIdealHombre);
        }
        else{
        int pesoIdealMujer = altura - 120;
        System.out.println("Su peso ideal es de " + pesoIdealMujer);            
        }
    }  
}