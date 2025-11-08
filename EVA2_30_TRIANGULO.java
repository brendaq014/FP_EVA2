/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_30_triangulo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_30_TRIANGULO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           System.out.println("¿Que numero quieres capturar?");
        int num;
        num = input.nextInt();
        
        for(int i = 1; i <= num; i++){
            
        for(int j = 1; j <= i; j++){
            System.out.print("*");
    }
        System.out.println();
        }
    }
}
