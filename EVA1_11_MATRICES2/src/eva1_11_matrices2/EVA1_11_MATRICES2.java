/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_matrices2;

/**
 *
 * @author carpi
 */
public class EVA1_11_MATRICES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]matriz = new int [3][]; // estoy dejando pendiente el tamaño de la segunda dimension
        matriz [0] = new int [3];
        matriz [1] = new int [5];
        matriz [2] = new int [1];
    
       for(int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("[" + matriz[i][j] + "]");
}
       System.out.println("");

}
    }
}
