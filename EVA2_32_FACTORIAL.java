/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_32_FACTORIAL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, factorial = 1;
        System.out.println("Introduce un valor:");
        valor = input.nextInt();
        for(int i = 1; i <= valor; i++){
            factorial = factorial * i;
    }
        System.out.println("Factorial de" + valor + "=" + factorial);{
    }
    }

}
