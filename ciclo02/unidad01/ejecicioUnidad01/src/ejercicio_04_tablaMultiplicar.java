/**
 * Solicitar un número al usuario y mostrar la tabla de multiplicar de ese número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la tabla y mostrar los datos.
 */

import java.util.Scanner;

public class ejercicio_04_tablaMultiplicar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el número entero de multiplicación:");    
            int multiplicador = reader.nextInt();
        reader.close();
        for (int i = 0 ; i <= 10; i++)
        {
        int multiplicacion = i * multiplicador;
        System.out.println("La multiplicación de " + multiplicador + " * " + i + " es igual a " + multiplicacion);
        }
    }  
}