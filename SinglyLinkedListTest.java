package hdt4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Revilo
 */
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
    }
    
   
    public void testSize() {
        System.out.println("size");
        SinglyLinkedList instance = new SinglyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("addFirst");
        Object value = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testpull() {
        System.out.println("removeFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = null;
        Object result = instance.pull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
