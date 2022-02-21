/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hqtey
 */
public class StudentInfoTest {
    
    public StudentInfoTest() {
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
     * Test of main method, of class StudentInfo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentInfo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resize method, of class StudentInfo.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        ImageIcon im = null;
        int w = 0;
        int h = 0;
        ImageIcon expResult = null;
        ImageIcon result = StudentInfo.resize(im, w, h);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
