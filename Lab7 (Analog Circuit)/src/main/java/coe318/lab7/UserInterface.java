/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coe318.lab7;

/**
 * @author Rayyan Faisal
 *
 * Interface defining the user interface for an electrical circuit application.
 */
public interface UserInterface {

    /**
     * Initializes the application.
     */
    public void start();

    /**
     * Main method to run the application logic.
     */
    public void run();

    /**
     * Displays a message asking the user to enter input.
     */
    public void display();

    /**
     * Outputs all the circuit elements added so far to the console.
     */
    public void spice();

    /**
     * Displays an end message.
     */
    public void end();

}
