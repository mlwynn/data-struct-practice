/**
 * 
 */
package array_list;

import java.lang.reflect.Array;

/**
 * @author Meredith Wynn
 * A generic implementation of a resizeable list that is array-based.
 */
public class ArrayList<E> {
	
	/** the number of elements that can be stored in the list*/
	private int cap;
	
	/** the number of elements currently stored in the list*/
	private int size;
	
	/** the array that holds the list items*/
	private E arr[];
	
	/** the default initial capacity of the array*/
	private static int INIT_CAP = 10;
	
	/**
	 * Creates a new ArrayList with an initial capacity of INIT_CAP which
	 * contains no elements.
	 */
	public ArrayList(Class<E> c) {
		this(c, INIT_CAP);
	}
	
	/**
	 * Creates a new ArrayList with the given initial capacity which
	 * contains no elements.
	 * @param capacity the initial capacity of the ArrayList
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Class<E> c, int capacity) {
		this.arr = (E[]) Array.newInstance(c, capacity);
		this.setCap(capacity);
		this.size = 0;
	}
	
	/**
	 * Adds the given element to the end of the list, increasing
	 * the capacity of the list if necessary.
	 * @param elem the element to add to the list
	 */
	public void add(E elem) {
		//if list is not big enough, double the capacity
		if(size++ >= cap) {
			cap *=2;
		}
		//add the new element to the end of the list
		this.arr[size - 1] = elem;
		
	}
	
	/**
	 * Returns the element found at the given index in the
	 * list, if it exists. Otherwise, an exception is thrown.
	 * @param idx the index at which to search for an item
	 * @return the item at the given index, if it exists in the list
	 */
	public E get(int idx) {
		if(idx > size || idx > cap) {
			throw new IllegalArgumentException("Invalid index");
		} else {
			return arr[idx];
		}
	}
	
	/**
	 * Returns the number of elements that can be held in the list.
	 * @return the capacity of the list
	 */
	public int getCap() {
		return cap;
	}

	/**
	 * Returns the number of elements currently held in the list.
	 * @return the size of the list
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the capacity of the list.
	 * @param cap the cap to set
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}

}
