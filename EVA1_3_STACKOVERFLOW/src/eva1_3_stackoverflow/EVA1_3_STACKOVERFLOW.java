/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_stackoverflow;

public class EVA1_3_STACKOVERFLOW {

    public static void main(String[] args) {

        System.out.println("INICIA main()");
        A();
        System.out.println("TERMINA main()");
    }

    public static void A() {
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }

    public static void B() {
        System.out.println("INICIA B()");
        A();
        System.out.println("TERMINA B()");
    }
}
    

