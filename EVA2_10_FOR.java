/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_10_FOR {

    public static void main(String[] args) {
       //TODO code application logic here
       //imprimir del 1 al 20
       for(int i = 1; i <= 20; i++){
        System.out.print(i + " - ");
        //IMPRIMIR AL REVES (20 AL 1)
       }for(int i = 20; i >= 1; i--)
           System.out.print(i + " - ");
       //IMPRIMIR LOS PARES DE 0 AL 100
       //0 - 2 - 4 - 6 - 8... 98 - 100
       //+=, -=, +=, /=
       System.out.print("");
       for(int i = 0; i <= 100;i+=2)
           System.out.print(i + " - ");
       //IMPRIMIR EN ORDEN INVERSO
       System.out.print("");
      for(int i = 100; i >= 0;i+=2)
          System.out.print(i + " - ");
      //SOLICITAR DOS NUMEROS AL USUARIO, IMPRIMIR LA LISTA
      //ENTRE ESOS NUMEROS
      //-3 Y 3 -- -3 -2 -1 0 1 2 3
      Scanner captu = new Scanner(System.in);
      int ini, fin;
      System.out.println("Inicio");
      ini = captu.nextInt();
      System.out.println("Final");
      fin = captu.nextInt();
      for(int i = ini; i <= fin; i++)
          System.out.println(i + " - ");
      System.out.println("");
      for(int i = fin; i >= ini; i++)
          System.out.println(i + " - ");
      System.out.println("");
              }
                
    }
    

 