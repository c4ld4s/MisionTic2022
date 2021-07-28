/**
 * Realizar un programa que calcule el sueldo de un trabajador, el programa solicita el número de horas que has trabajado en un mes, las horas se pagan a $30.000.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ejercicio_03_sueldoTrabajador {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el número de horas de trabajo:");    
            double horas = reader.nextDouble();
            double salario = horas * 30000;
        reader.close();
        System.out.println("El trabajador laboró " + horas + " y su salario es " + df.format(salario));
    }  
}