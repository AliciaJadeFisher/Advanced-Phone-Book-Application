/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alici
 */
public class PB_recordTest {
    
    public PB_recordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        System.out.println("=========== Testing PB_record ===========");
        System.out.println("PB_Record : John Marks 01534833933 07442122889 01534876542 jeffmarks@yahoo.co.uk");
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
     * Test of getInstance method, of class PB_record.
     */
    @Test
    public void testGetInstance() 
    {
        System.out.println("=========== Test : getInstance() ===========");
        
        PB_record first_instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        
        PB_record second_instance =  PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        assertEquals(first_instance, second_instance);
        System.out.println("First Instance Address : " + first_instance);
        System.out.println("Second Instance Address : " + second_instance);
        System.out.println("=========================================");
    }

    /**
     * Test of getfName method, of class PB_record.
     */
    @Test
    public void testGetfName() 
    {
        System.out.println("=========== Test : getfName() ===========");
        PB_record instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        String expResult = "John";
        String result = instance.getfName();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getsName method, of class PB_record.
     */
    @Test
    public void testGetsName() 
    {
        System.out.println("=========== Test : getsName() ===========");
        PB_record instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        String expResult = "Marks";
        String result = instance.getsName();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getpNumber method, of class PB_record.
     */
    @Test
    public void testGetpNumber() 
    {
        System.out.println("=========== Test : getpNumber() ===========");
        PB_record instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        String expResult = "01534833933";
        String result = instance.getpNumber();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getmNumber method, of class PB_record.
     */
    @Test
    public void testGetmNumber() 
    {
        System.out.println("=========== Test : getmNumber() ===========");
        PB_record instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        String expResult = "07442122889";
        String result = instance.getmNumber();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getwNumber method, of class PB_record.
     */
    @Test
    public void testGetwNumber() 
    {
        System.out.println("=========== Test : getwNumber() ===========");
        PB_record instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        String expResult = "01534876542";
        String result = instance.getwNumber();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getEmail method, of class PB_record.
     */
    @Test
    public void testGetEmail() 
    {
       System.out.println("=========== Test : getEmail() ===========");
        PB_record instance = PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk");
        String expResult = "jeffmarks@yahoo.co.uk";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }
}