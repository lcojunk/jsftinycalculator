/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author odzhara-ongom
 */
public class CalculatorBeanTest {

    public CalculatorBeanTest() {
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
     * Test of add method, of class CalculatorBean.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        CalculatorBean instance = new CalculatorBean();
        instance.setParam1(3);
        instance.setParam2(2);
        assertEquals("result", instance.add());
        assertEquals("5", instance.getResult());
    }

    /**
     * Test of substract method, of class CalculatorBean.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        CalculatorBean instance = new CalculatorBean();
        instance.setParam1(3);
        instance.setParam2(2);
        assertEquals("", instance.substract());
        assertEquals("1", instance.getResult());
    }

    /**
     * Test of multiply method, of class CalculatorBean.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        CalculatorBean instance = new CalculatorBean();
        instance.setParam1(3);
        instance.setParam2(2);
        assertEquals("", instance.multiply());
        assertEquals("6", instance.getResult());
    }

    /**
     * Test of divide method, of class CalculatorBean.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        CalculatorBean instance = new CalculatorBean();
        instance.setParam1(6);
        instance.setParam2(2);
        assertEquals("", instance.divide());
        assertEquals("3.0", instance.getResult());
    }

}
