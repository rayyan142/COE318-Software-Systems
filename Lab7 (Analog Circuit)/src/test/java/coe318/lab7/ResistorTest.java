package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Test class for the Resistor class. This class includes JUnit 4 test methods.
 *
 * @author Rayyan Faisal
 */
public class ResistorTest {

    public ResistorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testResistanceValue() {
        // Create a Resistor object with known resistance
        double expectedResistance = 50.2;
        Resistor resistor = new Resistor(expectedResistance, new Node(), new Node());

        // Check if the resistance value matches the expected value
        assertEquals(expectedResistance, resistor.resistance, 0.001);
    }

    @Test
    public void testGetNodes() {
        // Create two nodes
        Node node1 = new Node();
        Node node2 = new Node();

        // Create a Resistor connecting the nodes
        Resistor resistor = new Resistor(100.0, node1, node2);

        // Get the nodes from the resistor
        Node[] nodes = resistor.getNodes();

        // Check if the nodes array has the correct length
        assertEquals(2, nodes.length);

        // Check if the nodes array contains the expected nodes
        assertSame(node1, nodes[0]);
        assertSame(node2, nodes[1]);
    }
}
