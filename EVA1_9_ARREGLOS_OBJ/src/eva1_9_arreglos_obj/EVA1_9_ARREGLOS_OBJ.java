/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_arreglos_obj;

/**
 *
 * @author carpi
 */
public class EVA1_9_ARREGLOS_OBJ {

    public static void main(String[] args) {
        Ejemplo[] arreglo = new Ejemplo[2]; //arreglo que guarda dos objetos de tipo ejemplo
        System.out.println("arreglo= " + arreglo);
        System.out.println("arreglo= " + arreglo[0]);
        System.out.println("arreglo= " + arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("arreglo= " + arreglo[0]);
        System.out.println("arreglo= " + arreglo[1]);
        //NECESITAMOS UNA COPIA
        Ejemplo[] copia = arreglo;
        System.out.println("arreglo= " + arreglo);
        System.out.println("copia= " + copia);
        //no tengo un duplicado, sigo teniendo un arreglo con dos copias de la
        //direccion donde esta ubicado
        //¿como creo una copia del arreglo?
        
    }
}
class Ejemplo{
    int valor = 5;
}
