/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author oscar
 */
public class SequenceTest {
    
    public SequenceTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
   
    
    @Test 
    @DisplayName("First size() test")
    public void testSize1()
    {
        Sequence instance = new Sequence(16);
        System.out.println("First size() test");
        int expResult=16;
        int result=instance.size();
        assertEquals(expResult, result);
    }
    
    
    
    @Test
    @DisplayName("Second size() test")
    public void testSize2()
    {
        Sequence instance = new Sequence();
        System.out.println("Second size() test");
        int expResult=10;
        int result=instance.size();
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("First append(E element) test")
    public void testAppend1()
    {
        Sequence instance = new Sequence(16);
        System.out.println("First append(E element) test");
        Object expResult="Hello";
        instance.append("Hello");
        Object result=instance.get(0);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Second append(E element) test")
    public void testAppend2()
    {
        Sequence instance = new Sequence();
        System.out.println("Second append(E element) test");
        Object expResult=875432;
        instance.append(875432);
        Object result=instance.get(0);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("First get(int index) test")
    public void testGet1()
    {
        Sequence instance = new Sequence();
        System.out.println("First get(int index) test");
        Object expResult=875432;
        instance.append(875432);
        Object result=instance.get(0);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Second get(int index) test")
    public void testGet2()
    {
        Sequence instance = new Sequence();
        System.out.println("Second get(int index) test");
        Object expResult=34.34;
        instance.set(4,34.34);
        Object result=instance.get(4);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("First set(int index, E element) test")
    public void testSet1()
    {
        Sequence instance = new Sequence();
        System.out.println("First set(int index, E element) test");
        Object expResult=34.34;
        instance.set(4,34.34);
        Object result=instance.get(4);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Second set(int index, E element) test")
    public void testSet2()
    {
        Sequence instance = new Sequence();
        System.out.println("Second set(int index, E element) test");
        Object expResult=875432;
        instance.set(2,875432);
        Object result=instance.get(2);
        assertEquals(expResult, result);
    }
}
