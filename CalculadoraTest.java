import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Estuardo
 * @author Gerardo
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double n1 = 12;
        double n2 = 5;
        Calculadora instance = new Calculadora();
        double expResult = 17;
        double result = instance.sumar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double n1 = 12;
        double n2 = 5;
        Calculadora instance = new Calculadora();
        double expResult = 7;
        double result = instance.restar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double n1 = 12;
        double n2 = 5;
        Calculadora instance = new Calculadora();
        double expResult = 60;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double n1 = 12;
        double n2 = 4;
        Calculadora instance = new Calculadora();
        double expResult = 3;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
    }
    
}
