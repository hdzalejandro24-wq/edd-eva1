/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_6_arreglos;

/**
 *
 * @author carpi
 */
public class EVA_1_6_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo1 = new int [10]; //cuanta memoria ocupa? 40m bytes
        //acesso por indices 
        arreglo1[1] = 100;
        //en java el primer elementos esta en nla posicion 0 el ultimo en n-1;
        //donde n es el tamaño del arreglo
        for (int i = 0; i < 10; i++){ //llenarlo de valores aleatorios entre 0 y 99
            arreglo1[i] = (int)(Math.random()* 100);
        }
        for (int i = 0; i < 10; i++){//llenarlo de valores aleatorios entre 0 y 99
            System.out.println("[" + arreglo1 [i] + "]");
        }
    }
    
}
