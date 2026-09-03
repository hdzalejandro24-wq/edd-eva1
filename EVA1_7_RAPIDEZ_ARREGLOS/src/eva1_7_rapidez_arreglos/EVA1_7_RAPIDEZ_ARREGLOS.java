/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_rapidez_arreglos;

/**
 *
 * @author carpi
 */
public class EVA1_7_RAPIDEZ_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arreglo = new int[1000000000]; 
          for (int i = 0; i < arreglo.length; i++){ //EL MANEJO DE ARREFGLOS ES MUY RAPIDO
               arreglo[i] = (int)(Math.random() * 1000);
          }
    }
    
}
