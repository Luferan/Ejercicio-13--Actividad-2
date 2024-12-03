/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
public class Promociones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se crean dos variables tipo double valor de la compra(VALCOMP) 
        y valor a pagar(VALPAG), donde se van a ingresar sus respectivos valores
        */
        double VALCOMP, VALPAG;
        Scanner precio = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        VALCOMP = precio.nextDouble();
        // Se ingresa una variable tipo string para el color de la bolita
        System.out.println("Ingrese el color de la bolita en mayúsculas: ");
        String color = precio.next();
        /* Se llama a la clase que hace el calculo de las promociones según el
        color de la bolita
        */
        VALPAG = Valor_a_pagar.valor(VALCOMP, color);
        System.out.println("El cliente debe pagar $"+ VALPAG);
        
    }
    
}
