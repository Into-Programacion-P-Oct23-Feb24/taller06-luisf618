/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double numero1;
        double numero2;
        double operacion;
        String orden;
        System.out.println("Que operacion desea realizar");
        orden = entrada.nextLine();
        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextDouble();
        if (numero1 > numero2) {
            switch (orden) {
                case "suma":
                    operacion = numero1 + numero2;
                    System.out.printf("La solucion de la suma es: %s\n",
                            operacion);
                    break;
                case "resta":
                    operacion = numero1 - numero2;
                    System.out.printf("La solucion de la resta es: %s\n",
                            operacion);
                    break;
                case "multiplicacion":
                    operacion = numero1 * numero2;
                    System.out.printf("La solucion de la multiplicacion "
                            + "es: %s\n",
                            operacion);
                    break;
                case "division":
                    operacion = numero1 / numero2;
                    System.out.printf("La solucion de la division es:"
                            + " %s\n",
                            operacion);
                    break;
                default:
                    System.out.printf("Opcion invalida\n");

            }
        } else {
            System.out.println("No se puede realizar la operacion ya que el "
                    + "primer numero es menor al segundo");
        }
    }
}
