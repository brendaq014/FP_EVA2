/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_34_PRIMO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        System.out.println("Introduce un valor: ");
        valor = input.nextInt();
        boolean esPrimo = true;
        
        for (int i = 2; i < valor; i++) {
        int residuo = valor % i;
        if(residuo == 0){//no es numero primo
            esPrimo = false;
            break;
    }
}
         if(esPrimo)
            System.out.println("El valor " + valor + " es PRIMO");
        else
            System.out.println("El valor " + valor + " NO es PRIMO");
    }
}
