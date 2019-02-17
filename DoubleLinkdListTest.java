import static org.junit.Assert.*;

/**
 * @author Estuardo
 * @author Gerardo
 */

public class DoubleLinkdListTest {

    public void testpush() {
        System.out.println("addFirst");
        int value = 2;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.push(value);
        result = instance.peek();
        assertEquals(value, result);
    }
    
    public void testpop() {
        System.out.println("removeLast");
        DoublyLinkedList instance = new DoublyLinkedList();
        String expResult = "8";
        instance.push(8);
        Object result = instance.pop();
        result = result.toString();
        assertEquals(expResult, result);
    }
    
    public void testSize() {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    public void testEmpty() {
        System.out.println("clear");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 2;
        int result = 0;
        if(instance.empty()){
            result = 2;
        } else if(! instance.empty()){
            result = 1;
        }
        assertEquals(expResult, result)
    }
}
