/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_numeros.primos;
 import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA1_14_NUMEROSPRIMOS {


      public static void main(String[] args) {

       
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa cualquier numero: ");
        int n = entrada.nextInt();

        int contador1 = 0;
        int contador2 = 0;
        int divisores = 0;

        //PRIMERA FORMA UTILIZADA
        for (int i = 2; i <= n - 1; i++) {
            contador1++;

            if (n % i == 0) {
                divisores++;
            }
        }

        if (divisores == 0 && n > 1) {
            System.out.println(n + " Es primo");
        } else {
            System.out.println(n + " No es primo");
        }

        System.out.println("Operaciones con  n-1: " + contador1);
        
       //SEGUNDA FORMA UTLIZADA
        divisores = 0;

        for (int i = 2; i * i <= n; i++) {
            contador2++;

            if (n % i == 0) {
                divisores++;
            }
        }

        System.out.println("Operaciones con el metodo de raiz: " + contador2);
    }
}
  