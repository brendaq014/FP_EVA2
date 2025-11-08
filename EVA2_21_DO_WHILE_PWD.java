/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_21_DO_WHILE_PWD {
final static String USUARIO = "admin";
        final static String PWD = "admin";
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, contra;
        do{
        System.out.println("Acceso del sistema---------");
        System.out.println("USUARIO: ");
        usuario = input.nextLine();
        System.out.println("CONTRASEÑA: ");
        contra = input.nextLine();
        }while(!(usuario.equals(USUARIO) && contra.equals(PWD)));
        
    }
}
