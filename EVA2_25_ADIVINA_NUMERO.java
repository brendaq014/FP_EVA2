/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_adivina_numero;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_25_ADIVINA_NUMERO {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adivina el numero. Presiona -1 para terminar de jugar");
            valor = input.nextInt();
            if(valor == adivinar)
                System.out.println("Adivinaste!");
        }while(valor != -1);//CONDICION PARA REPETIR (true)

    }
}
