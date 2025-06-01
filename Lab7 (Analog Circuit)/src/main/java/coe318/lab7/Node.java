/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 * @author Rayyan Faisal
 *
 * Represents an electrical node in a circuit. Each node is uniquely identified
 * by an integer ID. The class automatically assigns a unique ID to each node
 * instance.
 */
public class Node {

    public int id;
    public static int nextID = 0;

    /**
     * Constructs a new Node. Automatically assigns a unique ID to the node.
     */
    public Node() {
        this.id = nextID;
        nextID++;
    }

    /**
     * Returns a string representation of the node. The string contains the
     * unique ID of the node.
     *
     * @return A string representing the node, including its ID.
     */
    public String toString() {
        return " " + this.id;
    }

}
