/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprogra;

import java.util.Scanner;

/**
 *
 * @author mi
 */
public class PracticaProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Entrada dato = new Entrada();
        
        int entero;
        double decimal;
        
        
        System.out.println("Ingrese el numero entero");
        entero = teclado.nextInt();
        dato.escribirEntero(entero);
        
            
        System.out.println("Ingrese el numero decimal");
        decimal = teclado.nextDouble();
        dato.escribirDecimal(decimal);
        
        
        dato.mostrar();
    }
    
}
