/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("¿Cuantas calificaciones quieres capturar?");
        tama = captu.nextInt();
        int califas[] = new int[tama];
        //captura
        for(int i = 0; i < califas.length; i++)
        System.out.println("Calificacion #" + (i + 1) + ":");
        califas[i] = captu.nextInt();{
        
    }
    //lectura
    for(int i = 0; i < califas.length; i++){
        System.out.print("[" + califas[i] + "]"); 
    
}
//promedio del grupo?
//sumar todas las calificaciones
int sumaCalifas = 0;
for(int i = 0; i < califas.length; i++);{
sumaCalifas = sumaCalifas + califas[i];
//sumaCalifas += califas[i
}
System.out.println("acumulado = " + sumaCalifas);
double promedio = sumaCalifas / califas.length;
System.out.println("Promedio: " + promedio);{
    }

    }

    }