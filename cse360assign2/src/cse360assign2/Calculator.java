/* 
 * Melanie Hendricks
 * ID: 402
 * Assignment 2
 */
package cse360assign2;

/**
 * Represents a calculator that can add, subtract, multiply and divide two integers.
 * @author melaniehendricks
 * 
 */

public class Calculator 
{

	private int total;
	private String operation;
	private String number;
	
	
	/**
	 * Represents a constructor that sets initial total to 0 and
	 * ensures that first number in the history is 0. 
	 */
<<<<<<< HEAD
	public Calculator () 
	{
		total = 0;  
		number = Integer.toString(total);
		operation = number + " "; 
		getHistory();
		
=======
	public int getTotal () {
		return total;
	}
	
	/**
	 * addition function
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
>>>>>>> refs/remotes/origin/master
	}
	
	
	
	/**
	 * Gets total
	 * @return total An integer that represents the total after an operation 
	 */
<<<<<<< HEAD
	public int getTotal () 
	{
		return total;
	}
	
	
	
	/**
	 * Addition function
	 * Converts integer to String for getHistory() method.
	 * Adds value to total. 
	 * @param value An integer to be used in an operation. 
	 */
	public void add (int value) 
	{
		number = Integer.toString(value);
		operation = operation + "+ " + number + " ";
		getHistory();
		total = total + value;
		getTotal();
		
=======
	public void subtract (int value) {
		total = total - value;
>>>>>>> refs/remotes/origin/master
	}
	
	
	
	/**
	 * Subtraction function
	 * Converts integer to String for getHistory() method.
	 * Subtracts value from total. 
	 * @param value An integer to be used in an operation. 
	 */
<<<<<<< HEAD
	public void subtract (int value) 
	{
		number = Integer.toString(value);
		operation = operation + "- " + number + " ";
		getHistory();
		total = total - value;
		getTotal();
=======
	public void multiply (int value) {
		total = total * value;
>>>>>>> refs/remotes/origin/master
	}
	
	
	
	/**
	 * Multiplication function
	 * Converts integer to String for getHistory() method.
	 * Multiplies total by value 
	 * @param value An integer to be used in an operation. 
	 */
<<<<<<< HEAD
	public void multiply (int value) 
	{
		number = Integer.toString(value);
		operation = operation + "* " + number + " ";
		getHistory();
		total = total * value;
		getTotal();
=======
	public void divide (int value) {
		if (value == 0){
			total = 0;
		}
		else
			total = total / value;
>>>>>>> refs/remotes/origin/master
	}
	
	
	
	/**
	 * Division function 
	 * Converts integer to String for getHistory() method.
	 * Divides total by value. 
	 * @param value An integer to be used in an operation. 
	 */
	public void divide (int value) 
	{
		number = Integer.toString(value);
		operation = operation + " / " + number + " ";
		getHistory();
		if (value == 0)
		{
			total = 0;
		}
		else
			total = total / value;
		getTotal();
	}
	
	
	
	
	/**
	 * Gets history of all actions. 
	 * @return A String representing the history of all values and 
	 * operations done within the program. 
	 */
	public String getHistory () 
	{
		return operation;
	}
}