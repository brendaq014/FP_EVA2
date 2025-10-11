/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_11_FOR {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticiones");
        rep = captu.nextInt();
        for(int i = 1; i <= rep; i++)
            System.out.println(mensaje);
    }
}
