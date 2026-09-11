/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_cambio_tamanio_arreglos;

/**
 *
 * @author carpi
 */
public class EVA1_8_CAMBIO_TAMANIO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        // NO SE PUEDE CAMBIAR EL TAMAÑO A UN ARREGLO
        int[] datos = new int[10];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }
        System.out.println("PRIMER ARREGLO DE 10:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
        }
        // NECESITAN UN RESPALDO
         // NECESITO CAMBIAR DE 10 A 5 ELEMENTOS LOS PRIMEROS 5) SIN PERDER LA INFORMACION
        int[] respaldo = datos;
        datos = new int[5];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = respaldo[i];
        }  
        System.out.println("SEGUNDO ARREGLO DE 5:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
        }
        
    }
}
