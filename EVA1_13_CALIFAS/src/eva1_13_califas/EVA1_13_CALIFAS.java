/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_califas;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA1_13_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURAS LAS CALIFAS DE VARIOS GRUPOS
        int grupos;
        Scanner captu = new Scanner (System.in);
        System.out.println("Cuantos grupos vas a capturar");
        grupos = captu.nextInt();
        //creamos una matriz, donde cada fila es un grupo  pero cada grupo tiene
        // diferente cantidad de estudiantes 
         int [][] califas = new int [grupos] [];
         for (int i = 0; i < grupos; i++){
         System.out.println(" Cuantos alumnos hay para cada grupo " + (i + 1));
        int alumnos = captu.nextInt();
        califas [i] = new int[alumnos];
         }
         //CAPTURAR LAS CALIFICACIONES DE CADA ALUMNO
         // IMPRIMIR LAS CALIFICACIONES
        //IMPRIMIR EL PROMEDIO POR GRUPO 
        
         //IMPRIMIR COMO QUEDO LA MATRIZ 
         for (int i = 0; i < califas.length; i++){
             for (int j = 0; j < califas[i].length; j++){
                 System.out.println("[" + califas[i][j] + "]");
             }
             System.out.println("");                 
             }
         
         
       
     
 }
    }
    
