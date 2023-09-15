/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.monedas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CalculadoraDeMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);        
        System.out.println("Ingresa el valor del peso en dolares: ");
        double pesos = lectura.nextDouble();
        double dolares =(17.10);
        double euros =(18.21);
        double yen =(0.012);
        double libras =(21.20);
        System.out.println("euro" + pesos/18.21);
        System.out.println("dolares" + pesos/17.10);
        System.out.println("yen" + pesos/0.012);
        System.out.println("libras" + pesos/21.20);

    }
    
}
