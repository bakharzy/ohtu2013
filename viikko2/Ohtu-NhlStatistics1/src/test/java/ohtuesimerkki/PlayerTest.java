/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bakharzy
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getAssists method, of class Player.
     */
    @Test
    public void testGetAssists() {
        System.out.println("getAssists");
        Player instance = null;
        int expResult = 0;
        int result = instance.getAssists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssists method, of class Player.
     */
    @Test
    public void testSetAssists() {
        System.out.println("setAssists");
        int assists = 0;
        Player instance = null;
        instance.setAssists(assists);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGoals method, of class Player.
     */
    @Test
    public void testGetGoals() {
        System.out.println("getGoals");
        Player instance = null;
        int expResult = 0;
        int result = instance.getGoals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGoals method, of class Player.
     */
    @Test
    public void testSetGoals() {
        System.out.println("setGoals");
        int goals = 0;
        Player instance = null;
        instance.setGoals(goals);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class Player.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        Player instance = null;
        String expResult = "";
        String result = instance.getTeam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeam method, of class Player.
     */
    @Test
    public void testSetTeam() {
        System.out.println("setTeam");
        String team = "";
        Player instance = null;
        instance.setTeam(team);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class Player.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Player.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Player t = null;
        Player instance = null;
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
