/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 * @author Rayyan Faisal
 *
 * Represents a Resistor in an electrical circuit. This class models a Resistor
 * by specifying its resistance and the nodes it connects.
 */
public class Resistor {

    public double resistance;
    public Node node1;
    public Node node2;
    private int resistor_id;
    private static int counter = 1;

    /**
     * Constructs a Resistor object with specified resistance and connected
     * nodes. It also assigns a unique ID to the resistor.
     *
     * @param resistance the resistance value of the resistor in ohms.
     * @param node1 the first node connected by the resistor.
     * @param node2 the second node connected by the resistor.
     * @throws IllegalArgumentException if the resistance is less than or equal
     * to zero.
     * @throws NullPointerException if either of the connecting nodes is null.
     */
    public Resistor(double resistance, Node node1, Node node2) {

        if (resistance <= 0) {
            throw new IllegalArgumentException("Enter a resistor value greater than 0!");
        }
        if (node1 == null || node2 == null) {
            throw new NullPointerException("The nodes connecting the resistor must exist!");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistor_id = counter;
        counter++;
    }

    /**
     * Returns an array of the two nodes that this resistor connects.
     *
     * @return an array of Node objects, where each Node is an end of the
     * resistor.
     */
    public Node[] getNodes() {
        Node[] nodes = new Node[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }

    /**
     * Provides a string representation of the Resistor, including its ID,
     * connected nodes, and resistance.
     *
     * @return a string in the format "R[id] [node1] [node2] [resistance]"
     */
    public String toString() {
        return ("R" + resistor_id + " " + node1 + " " + node2 + " " + resistance);

    }
}
