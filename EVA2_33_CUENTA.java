/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_33_CUENTA {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int retiro, cuenta = 1000000;
        
        do{
            System.out.println("Cuanto deseas retirar?");
            retiro = input.nextInt();
            cuenta = cuenta - retiro;
            System.out.println("Saldo " + cuenta);
        }while(cuenta > 0);

    }
}
