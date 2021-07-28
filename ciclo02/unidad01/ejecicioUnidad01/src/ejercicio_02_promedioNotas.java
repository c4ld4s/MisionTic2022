/**
 *Realizar un programa que realice el promedio de las notas de un alumno, para ello el programa va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir “Reprobado” . Requisitos: Las notas que se ingresan pueden tener decimales.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ejercicio_02_promedioNotas {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el nombre del estudiante:");    
            String nombre = reader.nextLine();
        System.out.println("Introduce la primer nota:");
            double nota1 = reader.nextDouble();
        System.out.println("Introduce la segunda nota:");
            double nota2 = reader.nextDouble();
        System.out.println("Introduce la tercer nota:");
            double nota3 = reader.nextDouble();
        reader.close();
        String nombre1 = nombre.toUpperCase();
        System.out.println("El nombre del alumno es " + nombre1);
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio del alumno es " + df.format(promedio));
        if (promedio >= 3)
        {
        System.out.println("Aprobado");   
        }
        else
        System.out.println("Reprobado");
    }  
}