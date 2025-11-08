/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_25_ADIVINAR_WHILE {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int valor = 0, adivinar;
        while(valor != -1){
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adivina el numero. Presiona -1 para terminar de jugar");
            valor = input.nextInt();
            if(valor == adivinar)
                System.out.println("Adivinaste!");

    }
}
