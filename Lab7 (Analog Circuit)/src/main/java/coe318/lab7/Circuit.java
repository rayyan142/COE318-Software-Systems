/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.*;

/**
 * @author Rayyan Faisal
 *
 * Represents an electrical circuit consisting of resistors and voltage sources.
 * This class allows for the addition and management of these components in a
 * circuit.
 */
public class Circuit {

    public ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    public ArrayList<VoltageSource> voltagesource = new ArrayList<VoltageSource>();

    /**
     * Adds a resistor to the circuit.
     *
     * @param r The resistor to be added.
     */
    public void addr(Resistor r) {
        resistors.add(r);
    }

    /**
     * Adds a voltage source to the circuit.
     *
     * @param v The voltage source to be added.
     */
    public void addv(VoltageSource v) {
        voltagesource.add(v);
    }

    private static Circuit instance = null;

    /**
     * Retrieves the singleton instance of the Circuit class. Creates a new
     * instance if it does not exist.
     *
     * @return The singleton instance of Circuit.
     */
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    /**
     * Private constructor for Circuit. Used to enforce the singleton pattern.
     */
    private Circuit() {
    }

    /**
     * Provides a string representation of the circuit, listing all resistors
     * and voltage sources.
     *
     * @return A string detailing the components of the circuit.
     */
    public String toString() {
        String result1 = "";
        String result = "";
        int i = 0;

        //Checks in the array list to see if there are values to be outputted
        while (i < voltagesource.size() || i < resistors.size()) {
            // If there are values in the voltage source arraylist, they are outputted at index i
            if (i < voltagesource.size()) {
                result += voltagesource.get(i);
            }

            // If there are values in the resistor arraylist, they are outputted at index i
            if (i < resistors.size()) {
                result1 += resistors.get(i);
            }
            i++;
        }
        return result + result1;
    }

}
