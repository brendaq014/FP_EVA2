/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_24_CICLO_INFINITO {
 final static String USUARIO = "admin";
        final static String PWD = "admin";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, contra;
        while(true){
        System.out.println("Acceso del sistema---------");
        System.out.println("USUARIO: ");
        usuario = input.nextLine();
        System.out.println("CONTRASEÑA: ");
        contra = input.nextLine();
        if(usuario.equals(USUARIO) && contra.equals(PWD))
            break;//termina el ciclo
        }
        System.out.println("Bienvenido al sistema");

    }
}
