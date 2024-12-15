/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exponente;

import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Exponente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,exponente,resultado;
        
       System.out.println("Favor ingresar la base: ");
       base = entrada.nextDouble();
       
       System.out.println("Favor ingresar el exponente: ");
       exponente = entrada.nextDouble();
               
       resultado= Math.pow(base, exponente);
       
       System.out.println("El resultado es: "+ resultado);
    }
}
