public class ListFactoryTest {
    
    public ListFactoryTest() {
    }
    
   
    /**
     * Test of getList method, of class ListFactory.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        String type = "";
        ListFactory instance = new ListFactory();
        List expResult = null;
        List result = instance.getList(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
