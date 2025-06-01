/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 * @author Rayyan Faisal
 *
 * Represents a Voltage Source in an electrical circuit. This class models a
 * voltage source with a specified voltage and connects between two nodes. It
 * ensures the polarity of the voltage source is correctly aligned with the node
 * IDs. Unique ID is assigned to each voltage source.
 */
public class VoltageSource {

    private double voltage;
    private Node node1;
    private Node node2;
    private int id;
    private static int counter = 1;

    /**
     * Creates a VoltageSource with specified voltage and connected nodes. The
     * constructor checks the polarity based on node IDs and voltage sign. If
     * polarity is incorrect, an IllegalArgumentException is thrown.
     *
     * @param voltage the voltage of the source.
     * @param node1 the first node this source is connected to.
     * @param node2 the second node this source is connected to.
     * @throws IllegalArgumentException if polarity is not aligned with node
     * IDs.
     */
    public VoltageSource(double voltage, Node node1, Node node2) {

        if ((node1.id > node2.id && voltage > 0) || (node1.id < node2.id && voltage < 0)) {
            this.node1 = node1;
            this.node2 = node2;
            this.voltage = voltage;
            this.id = counter;
            counter++;
        } else {
            throw new IllegalArgumentException("The polarity of the voltage source is not correct");
        }
    }

    /**
     * Returns the nodes connected to this voltage source. The first element is
     * node1 and the second is node2.
     *
     * @return an array of two nodes connected to this voltage source.
     */
    public Node[] getNodes() {
        Node[] nodes = new Node[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }

    /**
     * Provides a string representation of the voltage source. It includes the
     * ID, connected nodes, type (DC), and the voltage value. If node1 has a
     * lower ID than node2, voltage is displayed with a negative sign.
     *
     * @return a string detailing the voltage source's characteristics.
     */
    public String toString() {
        if (this.node1.id < this.node2.id) {
            return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC " + "-" + this.voltage;
        } else {
            return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC " + this.voltage;
        }
    }
}
