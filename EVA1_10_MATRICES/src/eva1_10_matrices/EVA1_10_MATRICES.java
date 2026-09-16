/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_matrices;

/**
 *
 * @author carpi
 */
public class EVA1_10_MATRICES {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        int[][] matriz = new int[5][3]; // 15 enteros --> matriz de 5 filas por 3 columnas
        // llenar con datos aleatorios
        for (int i = 0; i < matriz.length; i++) { // primera dimension (5 filas)
          for (int j = 0; j < matriz[i].length; j++) { // segunda dimension (3 columnas)
                matriz[i][j] = (int) (Math.random() * 100);

            }
        }

        // imprimir
        for (int i = 0; i < matriz.length; i++) { // primera dimension (5 filas)
            for (int j = 0; j < matriz[i].length; j++) { // segunda dimension (3 columnas)
                System.out.print("[" + matriz[i][j] + "]");

            }

            System.out.println("");

        }

    }
}