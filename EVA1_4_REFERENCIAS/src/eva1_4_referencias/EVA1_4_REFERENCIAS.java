/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_referencias;

/**
 *
 * @author carpi
 */
public class EVA1_4_REFERENCIAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //REFERENCIAS --> DIRECCION DE MEMORIA (FALSA) ES EN EL CASO DE JAVA 
        //APUNTADORES --> DIRECCIONES DE MEMORIA -->C++
        Prueba prueba = new Prueba();
        System.out.println( prueba);
                //QUITAR LA DIRECCION
                prueba = null; //permitir destruir(liberar memoria) de un objeto
    }//COMO DESTRUTE JAVA LOS OBJETOS QUE YA NO SE VAN A USAR?
    //GARBAGE COLLECTOR
    
}
class Prueba{
}

