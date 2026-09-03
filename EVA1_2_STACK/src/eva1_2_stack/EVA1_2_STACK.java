/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_stack;

/**
 *
 * @author carpi
 */
public class EVA1_2_STACK {

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
        int i = 5;
        double b = 8;
        System.out.println("TERMINA B()");
    }
}