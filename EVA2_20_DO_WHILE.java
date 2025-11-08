/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_20_DO_WHILE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Menu principal--------");
        System.out.println("Presiona la opción");
        System.out.println("1. Pedidos: ");
        System.out.println("2. Porveedores: ");
        System.out.println("3. Facturacion: ");
        System.out.println("4. Salir");
        opcion = input.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("Pedidos del sistema!");
                break;
            case 2:
                System.out.println("Proveedores del sistema!");
                break;
            case 3:
                System.out.println("Facturacion del sistema!");
                break;
                
        }
        }while(opcion != 4);//mientras opcion sea diferente de 4
        System.out.println("Finalizacion del programa!");
        
    }
    }
}
