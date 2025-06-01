/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Rayyan Faisal
 */
public class TestClass {
    public static void main(String[] args) {
        Circuit c1 = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        
        Resistor R1 = new Resistor(50, A,B);
        Resistor R2 = new Resistor(25, B,C);
        System.out.println(R1.toString());
        System.out.println(R2.toString());
        
        c1.addResistors(R1);
        c1.addResistors(R2);
        
        System.out.println(c1.toString());
        
    }
    
}

