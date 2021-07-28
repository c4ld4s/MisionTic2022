/**
 *Realizar la suma, la resta, la división y la multiplicación de dos números  leídos por teclado y mostrar en pantalla “La <operación> de <número 1> y <número 2> es igual a <resultado> ”.
*/

import java.util.Scanner;
public class ejercicio_01_operaciones {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            double numero1 = 0;
            double numero2 = 0;
                System.out.println("Introduce el primer número entero:");      
                    numero1 = reader.nextInt();
                System.out.println("Introduce el segundo número entero:");
                    numero2 = reader.nextInt();
        reader.close();
    int suma = (int) Math.round(numero1 + numero2);
    int resta = (int) Math.round(numero1 - numero2);
    int multilicación = (int) Math.round(numero1 * numero2);
    double división =  numero1 / numero2;
    System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
    System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual a " + resta);
    System.out.println("La multilicación de " + numero1 + " y " + numero2 + " es igual a " + multilicación);
    System.out.println("La división de " + numero1 + " y " + numero2 + " es igual a " + división);
    }  
}