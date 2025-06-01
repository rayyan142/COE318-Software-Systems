/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Rayyan Faisal
 */
public class Node {
    
    private int nodeID;
    private static int node_Count = 0;
    
    public Node(){
        this.nodeID = node_Count;
        node_Count ++;
    }
    
    @Override
    public String toString(){
        return("" + this.nodeID);
    }
    
}
