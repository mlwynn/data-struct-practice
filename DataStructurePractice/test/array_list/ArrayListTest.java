/**
 * 
 */
package array_list;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the ArrayList class.
 * @author Meredith Wynn
 *
 */
public class ArrayListTest {

	/**
	 * Tests the add() method by adding several strings to a new ArrayList.
	 */
	@Test
	public void testAdd() {
		//create a new ArrayList
		ArrayList<String> li = new ArrayList<String>(String.class);
		
		//add some new strings
		String one = "one";
		String two = "two";
		String three = "three";
		
		li.add(one);
		li.add(two);
		li.add(three);
		
		//ensure correct order
		assertTrue(li.get(0).equals(one));
		assertTrue(li.get(1).equals(two));
		assertTrue(li.get(2).equals(three));
		
		//ensure correct size and capacity
		assertTrue(li.getCap() == 10);
		assertTrue(li.getSize() == 3);
		
		
	}

}
