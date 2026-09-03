/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_paso_valor_referencia;

/**
 *
 * @author carpi
 */
public class EVA1_5_PASO_VALOR_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println("Valor de x " + x);
        incrementar(x);
         System.out.println("Valor de x modificado = " + x);//AQUI NO HAY CAMBIOS
         //ahora con objetos
         MiValor mv = new MiValor();
            System.out.println("MiValor.y = " + mv.y);   
            incrementarObj(mv);
            System.out.println("MiValor.y = " + mv.y);//AQUI SI HAY CAMBIOS    
        
    }
    //RECIBO UNA COPIA DE LA DIRECCION 
    public static void incrementar(int valor){ //paso por valor 
        valor = valor + 1;         
    }
    public static void incrementarObj(MiValor valor){
        valor.y =valor.y + 1;
}
  
}
  class MiValor{
    int y = 5;
} 
