/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_29_continue;

/**
 *
 * @author usuario
 */
public class EVA2_29_CONTINUE {

    public static void main(String[] args) {
         //continue --> detiene la iteración (repetición) actual
        //imprimir numeros pares
        for (int i = 0; i < 100; i++){
            int resi = i % 2;
            if(resi != 0)
                continue;//aqui se interrumpe el ciclo
            System.out.println(i + " - ");
        }
    }
}
