/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_tabla_multiplicar;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_12_TABLA_MULTIPLICAR {

    public static void main(String[] args) {
       //TODO code application logic here 
       Scanner captu = new Scanner(System.in);
       int valor;
       System.out.println("Tabla de multiplicar: ");
       valor = captu.nextInt();
       for(int i = 1; i <= 10; i++){
           int mult = valor * i;
           System.out.println(valor + " x " + i + " = " + mult);
           
       }
    }
}
