/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Scanner;
import java.util.Locale;


/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
                   
        String tipo1 = "No existe el tipo de vehiculo";
        String nombre;
        int tipo;
        double valorVehiculo;
        double valorPeaje = 0;
        
        
        System.out.println("Ingrese el tipo de vehiculo");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el valor del vehiculo");
        valorVehiculo = entrada.nextDouble();
        System.out.println("Ingrese su nombre por favor");
        entrada.nextLine();
        nombre = entrada.nextLine();
        switch(tipo){
            case 1:
                valorPeaje = (valorVehiculo * 0.01)/100 + 2;
                tipo1 = "Vehiculos livianos particulares";
                break;
            case 2:
                valorPeaje = (valorVehiculo * 0.02)/100 + 2.5;
                tipo1 = "Vehiculos grandes particulares";
                break;
            case 3:
                valorPeaje = (valorVehiculo * 0.04)/100 + 1.5;
                tipo1 = "Taxis";
                break;
            case 4:
                valorPeaje = (valorVehiculo * 0.05)/100 + 2.2;
                tipo1 = "Buses urbanos";
                break;
            default:
                System.out.println("No existe el tipo de vehiculo");
                
                
        }
        System.out.printf("Peaje \"Buena vía\" Propietario: %s Tipo: %s "
                + "Valor: $%s Peaje: $%s\n", nombre, tipo1,
                valorVehiculo, valorPeaje);
        }
    
}
