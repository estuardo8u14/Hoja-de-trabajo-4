import static org.junit.Assert.*;

/**
 * @author Estuardo
 * @author Gerardo
 */

public class CircularListTest {

    public void testpush() {
        System.out.println("addFirst");
        Object value = null;
        CircularList instance = new CircularList();
        instance.push(value);
        // TODO revisa el código de prueba generado y elimine la llamada predeterminada para fallar.
        fail("The test case is a prototype.");
    }
    public void testpop() {
        System.out.println("removeLast");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO revisa el código de prueba generado y elimine la llamada predeterminada para fallar
        fail("The test case is a prototype.");
        }
}
