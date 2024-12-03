/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;
/* Se crea una clase que hace el descuento según el color de la bolita y retorna
el valor total de la compra
 */
public class Valor_a_pagar {
    public static double valor(double VALCOMP, String color){
    double PDES;
    if (color.equals("BLANCO")){
        PDES = 0;
        }
    else if (color.equals("VERDE")){
        PDES = 10;
        }
    else if (color.equals("AMARILLO")){
        PDES = 25;
        }
    else if (color.equals("AZUL")){
        PDES = 50;
        }
    else {
        PDES = 100;
        }
    return VALCOMP - PDES * VALCOMP/100;
    } 
}
