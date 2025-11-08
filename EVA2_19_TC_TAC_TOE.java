/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_tc_tac_toe;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_19_TC_TAC_TOE {

    public static void main(String[] args) {
        int ticpoe[][]= new int[3][3];
        int fila, col, jug;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce tu jugada, Fila:");
            fila = input.nextInt();
            System.out.println("Introduce tu jugada, Columna: ");
            col = input.nextInt();
            System.out.println("Jugador (1 o 2): ");
            jug = input.nextInt();
            ticpoe[fila][col] = jug;
        }
        for(int i = 0; i < ticpoe.length; i++){
           for(int j = 0; j < ticpoe[i].length; j++){
               System.out.print("["+ticpoe[i][j]+"]");
    }
            System.out.println();
        }
    }
}
