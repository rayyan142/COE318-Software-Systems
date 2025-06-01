/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Rayyan Faisal
 */
public class Resistor {
    
    public double resistance;
    public Node node1;
    public Node node2;
    public int resistor_ID;
    private static int resistor_Count = 1;
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance < 0){
            throw new IllegalArgumentException("The resistors value can't be negative!");
        }
        
        if(node1 == null || node2 == null){
            throw new NullPointerException("The nodes connecting the resistors must exist!");
        }
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistor_ID = resistor_Count;
        resistor_Count++;
    }
    
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    @Override
    public String toString(){
        return("R" + resistor_ID + " " + node1 + " " + node2+ " " + resistance);
    }
    
}
