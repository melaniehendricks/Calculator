/* 
 * Melanie Hendricks
 * ID: 402
 * Assignment 2
 */
package cse360assign2;

/**
 * Represents a calculator
 * @author melaniehendricks
 *
 */

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * gets total
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * addition function
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
	}
	
	
	/**
	 * subtraction function
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	
	/**
	 * multiplication function
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	
	/**
	 * division multiplication
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0){
			total = 0;
		}
		else
			total = total / value;
	}
	
	
	/**
	 * gets history of all actions 
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}