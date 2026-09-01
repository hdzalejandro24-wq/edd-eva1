/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author carpi
 */
public class EVA1_1_SCOPE {

    
    public static void main(String[] args) {
       int x = 100; // EXISTE EN TODO EL BLOQUE MAIN
       for (int i = 0; i < 10; i++) { // EXISTE EN TODO EL BLOQUE DEL FOR 
        System.out.println("Valor de i =" + i);
    }
       System.out.println("Valor de final de la i =" + i); // NO EXISTE AQUI
     System.out.println("Valor de final de la i =" + x); //EXISTE AQUI
    }       
    public static void OtraFuncion(){
         System.out.println("Valor x = " + x);  //NO EXISTE AQUI
      
        
    }
    }

