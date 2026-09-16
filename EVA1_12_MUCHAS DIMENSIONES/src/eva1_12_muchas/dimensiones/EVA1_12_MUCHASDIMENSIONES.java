/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_muchas.dimensiones;

/**
 *
 * @author carpi
 */
public class EVA1_12_MUCHASDIMENSIONES {

    public static void main(String[] args) {

        int[][][][] muchasDim = new int[3][3][3][3];

        // llenar con datos aleatorios
        for (int i = 0; i < muchasDim.length; i++) {
            for (int j = 0; j < muchasDim[i].length; j++) {
                for (int k = 0; k < muchasDim[i][j].length; k++) {
                    for (int l = 0; l < muchasDim[i][j][k].length; l++) {
                        muchasDim[i][j][k][l] =
                                (int) (Math.random() * 100);
                    }
                }
            }
        }

    }
}
   // IMPRIMIR
        for (int i = 0; i < muchasDim.length; i++) {
            for (int j = 0; j < muchasDim[i].length; j++) {
             for (int k = 0; k < muchasDim[i][j].length; k++) {
                    for (int l = 0; l < muchasDim[i][j][k].length; l++) {
                        System.out.print("[" + muchasDim[i][j][k][l] + "]");
                    }
                    System.out.println("");
                }
            }
        }

    
        

    
