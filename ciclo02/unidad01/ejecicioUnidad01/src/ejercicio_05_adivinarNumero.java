/**
 * Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que adivinar introduciendo el número por teclado. En el caso que el número a adivinar sea mayor al ingresado, decirle al usuario “El número que busca es  mayor”, de lo contrario, “El número que busca es menor”. El programa finalizará cuando se introduzca el número correcto. Nota: usar la clase Random para generar el número aleatorio. 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio_05_adivinarNumero {
    public static void main(String[] args) {
        int numeroAdivinado = 0;
        int numeroAleatorio = (int)(Math.random()*100+1);
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número");
        do{
            numeroAdivinado =  Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
            if (numeroAleatorio > numeroAdivinado)
            {
                System.out.println("Ingresa un número mayor");
            }
            else{
                System.out.println("Ingresa un número menor");                
            }
        }while(numeroAdivinado != numeroAleatorio);
        System.out.println("Lograste adivinar el número");
        reader.close();
    }  
}