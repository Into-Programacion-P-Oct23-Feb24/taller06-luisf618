/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo;
        double sueldoTotal;
        double sueldo;
        double incremento;

        System.out.println("Inegrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = entrada.nextDouble();

        switch (tipo) {
            case 1:
                incremento = sueldo * 0.05;
                sueldoTotal = sueldo + incremento;
                break;
            case 2:
                incremento = sueldo * 0.07;
                sueldoTotal = sueldo + incremento;
                break;
            case 3:
                incremento = sueldo * 0.09;
                sueldoTotal = sueldo + incremento;
                break;
            case 4:
                incremento = sueldo * 0.12;
                sueldoTotal = sueldo + incremento;
                break;
            default:
                incremento = sueldo * 0.15;
                sueldoTotal = sueldo + incremento;
                break;
        }
        System.out.printf("El incremento del sueldo es: $%.2f\nEl sueldo es"
                + " $%.2f\n", incremento, sueldoTotal);
    }

}
