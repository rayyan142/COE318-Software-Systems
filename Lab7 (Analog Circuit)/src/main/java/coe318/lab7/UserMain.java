/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Rayyan Faisal
 *
 * This class represents the main user interface for a simple electronic circuit
 * simulator. It handles user inputs to create and manage circuit elements like
 * resistors and voltage sources. The user can add circuit elements, display
 * them, and exit the program.
 */
public class UserMain implements UserInterface {

    String input = "";
    ArrayList<Object> cirElement = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);

    /**
     * Initializes the program by displaying the initial instructions and
     * starting the main run loop.
     */
    public void start() {
        display();
        run();
    }

    /**
     * The main loop of the program. It listens for user input and processes it.
     * Users can add resistors and voltage sources to the circuit, display all
     * circuit elements, or exit the program by typing specific commands.
     */
    public void run() {

        while (true) {
            input = userIn.nextLine().trim();
            if (input.equalsIgnoreCase("end")) {
                end();
                break;
            } else if (input.equalsIgnoreCase("spice")) {
                spice();
            } else {
                String[] value = input.split(" ");
                if (value.length != 4) {
                    System.out.println("Please review the format of your inputs");
                } else {
                    if (input.toLowerCase().startsWith("v")) {
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(temp, n1, n2);
                        cirElement.add(v);
                    } else if (input.toLowerCase().startsWith("r")) {
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(temp, n1, n2);
                        cirElement.add(r);

                    }
                }
            }

        }
    }

    /**
     * Displays the initial instruction to the user on how to enter input.
     */
    public void display() {
        System.out.println("Enter your input:");
    }

    /**
     * Outputs all the circuit elements added so far to the console. Each
     * element is displayed in a format defined by its own `toString` method.
     */
    public void spice() {
        for (Object o : cirElement) {
            System.out.println(o);
        }
    }

    /**
     * Signals the end of the program and outputs a closing message.
     */
    public void end() {
        System.out.println("All done");
    }

    /**
     * The main method that launches the application.
     *
     * @param args Command line arguments, not used in this application.
     */
    public static void main(String[] args) {
        UserMain m = new UserMain();
        m.start();
    }
}
