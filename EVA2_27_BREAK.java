/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_27_BREAK {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adivina el numero. Presiona -1 para terminar de jugar");
            valor = input.nextInt();
            if(valor == adivinar)
                System.out.println("Adivinaste!");
            else if(valor == -1){
                System.out.println("Gracias por jugar!");
            break;//termina el ciclo del juego
        }else{
                System.out.println("No adivinaste!");
            }      
        }while(true);//CONDICION PARA REPETIR (true)

    }
}
