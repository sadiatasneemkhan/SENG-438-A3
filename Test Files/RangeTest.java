package org.jfree.data;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
	
	private Range exampleRange;
    private Range exampleRange2;
    private Range exampleRange3;
    private Range exampleRange4;
    private Range exampleRange5;
    private Range exampleRange6;
    private Range exampleRange7;
    private Range nullRange;			//null range
    private Range exampleRange11;
    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-100.0, 200.0);
    	exampleRange2 = new Range(-75.0, 94.0);
    	exampleRange3 = new Range(-59.6, -20.3);
    	exampleRange4 = new Range(20.7, 100.5);
    	exampleRange5 = new Range(0.0, 0.0);
    	exampleRange6 = new Range(-1, 1); 
    	exampleRange7 = new Range(-100000.0, 2000000.0);
    	exampleRange11 = new Range(-59.6, 100.5);
    }
    
    //Start of contains testing
    @Test
    public void test_contains_withinRange() {
    	assertTrue("The range should contain 50.4", exampleRange.contains(50.4));
    }
    
    @Test
    public void test_contains_upperBound() {
    	assertTrue("The range should contain 200.0", exampleRange.contains(200.0));
    }
    
    @Test
    public void test_contains_lowerBound() {
    	assertTrue("The range should contain -100.0", exampleRange.contains(-100.0));
    }
    
    @Test
    public void test_contains_outsideLowerRange() {
    	assertFalse("The range should not contain -100.1", exampleRange.contains(-100.1));
    }
    
    @Test
    public void test_contains_outsideUpperRange() {
    	assertFalse("The range should not contain 200.001", exampleRange.contains(200.001));
    }
    
    @Test
    public void test_contains_insideLowerRange() {
    	assertTrue("The range should contain -99.99", exampleRange.contains(-99.99));
    }
    
    @Test
    public void test_contains_insideUpperRange() {
    	assertTrue("The range should contain 199.9", exampleRange.contains(199.9));
    }
 
    //Start of getLength testing
    @Test
    public void test_getLength_negPos() {
    	assertEquals("The length of the range should be 169.0", 169.0, exampleRange2.getLength(), 0.000000001d);
    }
    
    @Test
    public void test_getLength_negNeg() {
    	assertEquals("The length of the range should be 39.3", 39.3, exampleRange3.getLength(), 0.000000001d);
    }
    
    @Test
    public void test_getLength_posPos() {
    	assertEquals("The length of the range should be 79.8", 79.8, exampleRange4.getLength(), 0.000000001d);
    }
    
    @Test
    public void test_getLength_bigNegPos() {
    	assertEquals("The length of the range should be 2100000.0", 2100000.0, exampleRange7.getLength(), 0.000000001d);
    }
    
    @Test
    public void test_getLength_sameBounds() {
    	assertEquals("The length of the range should be 0.0", 0.0, exampleRange5.getLength(), 0.000000001d);
    }
    
    //Start of getCentralValue testing
    @Test
    public void test_getCentralValue_negAndPosRange() {
    	assertEquals("The central value should be 9.5", 9.5, exampleRange2.getCentralValue(), 0.000000001d);
    }
    
    @Test
    public void test_getCentralValue_negRange() {
    	assertEquals("The central value should be -39.95", -39.95, exampleRange3.getCentralValue(), 0.000000001d);
    }
    
    @Test
    public void test_getCentralValue_posRange() {
    	assertEquals("The central value should be 60.6", 60.6, exampleRange4.getCentralValue(), 0.000000001d);
    }
    
    @Test
    public void test_getCentralValue_zeroRange() {
    	assertEquals("The central value should be 0.0", 0.0, exampleRange5.getCentralValue(), 0.000000001d);
    }

    //Start of expandToInclude testing
    @Test
	public void test_expandToInclude_withinRange(){
		double value = 0.8;	
		Range actual = Range.expandToInclude(exampleRange6, value);
		
		//lower bound checked
		assertEquals("The range should be [-1,1].",
		        -1, actual.getLowerBound(), .000000001d);
		
		//upper bound checked
		assertEquals("Range should be [-1,1].",
		        1, actual.getUpperBound(), .000000001d);
	}
    
    @Test
    public void test_expandToInclude_outsideUpperRange(){
		double value = 1.01;	
		Range actual = Range.expandToInclude(exampleRange6, value);
		
		//lower bound checked
		assertEquals("The range should be [-1,1.01].",
		        -1, actual.getLowerBound(), .000000001d);
		
		//upper bound checked
		assertEquals("Range should be [-1,1.01].",
		        1.01, actual.getUpperBound(), .000000001d);
	}
    
    @Test
    public void test_expandToInclude_outsideLowerRange(){
		double value = -1.01;	
		Range actual = Range.expandToInclude(exampleRange6, value);
		
		//lower bound checked
		assertEquals("The range should be [-1.01,1].",
		        -1.01, actual.getLowerBound(), .000000001d);
		
		//upper bound checked
		assertEquals("Range should be [-1.01,1].",
		        1, actual.getUpperBound(), .000000001d);
	}
    
    @Test
    public void test_expandToInclude_upperBoundary(){
		double value = 1;	
		Range actual = Range.expandToInclude(exampleRange6, value);
		
		//lower bound checked
		assertEquals("The range should be [-1,1].",
		        -1, actual.getLowerBound(), .000000001d);
		
		//upper bound checked
		assertEquals("Range should be [-1,1].",
		        1, actual.getUpperBound(), .000000001d);
	}
    
    @Test
    public void test_expandToInclude_lowerBoundary(){
		double value = -1;	
		Range actual = Range.expandToInclude(exampleRange6, value);
		
		//lower bound checked
		assertEquals("The range should be [-1,1].",
		        -1, actual.getLowerBound(), .000000001d);
		
		//upper bound checked
		assertEquals("Range should be [-1,1].",
		        1, actual.getUpperBound(), .000000001d);
	}
    
//////////////////////////////////////////////////////////////////////////////////////
    
    //NEW TEST
    @Test
    public void test_expandToInclude_nullRange(){
    	double value = 3;	
		Range actual = Range.expandToInclude(nullRange, value);
		
		//lower bound checked
		assertEquals("The range should be [3,3].",
		        3, actual.getLowerBound(), .000000001d);
		
		//upper bound checked
		assertEquals("Range should be [3,3].",
		        3, actual.getUpperBound(), .000000001d);
    }
 
    ///////////////////////////////////////////////////////////////////////////////////
    
    
    //Start of getLowerBound testing
    @Test
    public void test_getLowerBound_negBound(){
		assertEquals("The lower bound for range [-1, 1] should be -1.",
		        -1, exampleRange6.getLowerBound(), .000000001d);
	}
    
    @Test
    public void test_getLowerBound_posBound(){
		assertEquals("The lower bound for range [20.7, 100.5] should be 20.7.",
		        20.7, exampleRange4.getLowerBound(), .000000001d);
	}
    
/////////////////////////////////////////////////////////////////////////////////////////////    
   
  //NEW TESTS
  //Start of combine testing
    @Test
    public void test_combine_lowerBoundaryIsNull() {
        assertEquals("The Range should be (-75.0, 94.0)", exampleRange2, Range.combine(null, exampleRange2));
    }

    @Test
    public void test_combine_upperBoundaryIsNull() {
        assertEquals("The Range should be (20.7, 100.5)", exampleRange4, Range.combine(exampleRange4, null));
    }

    @Test
    public void test_combine_validBoundaries() {
        assertEquals("The Range should be (-59.6, 100.5)", exampleRange11, Range.combine(exampleRange3, exampleRange4));
    }
  
 ////////////////////////////////////////////////////////////////////////////////////////////////   
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    
}
