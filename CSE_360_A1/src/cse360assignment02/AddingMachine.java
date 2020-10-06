/**
 * This java class is practice with git and github. 
 * The program is a simlpe + and - calculator that also hold memory
 * @author Diana
 */

package cse360assignment02;

public class AddingMachine {
	
	private int total; 
	private String memory; 
	
    /**
     * Constructor.(For initializing total and memory )
     */
	public AddingMachine() 
	{
		total = 0;  
		memory = "0"; 
	}
	
	/**
	 * registers the integer to be used or displayed when called
	 * @return the int to use
	 */

	public int getTotal ()
	{
		return total; 
	}
	
	/**
	 * Registers the total + an integer and stores the operation in a string
	 * @param memory a string that now stores the add operation done
	 * @param value an integer to be added to total
	 * @param total an integer that holds a value after arithmetic opertaions
	 */
	
	public void add (int value) 
	{
		total = total + value;
		memory = memory + " + " + value; 
	}
	/**
	 * Registers the total - an integer and stores the operation in a string
	 * @param value an integer to be added to the total
	 * @param memory a string that now stores the subtact operation done ex " - 7"
	 * @param total  an integer that holds a value after arithmetic opertaions
	 */
	
	public void subtract (int value) 
	{
		total = total - value;
		memory = memory + " - " + value; 
	}

	
	/**
	 * Registers the string to be printed out when called  
	 * @return give a string called memory
	 */
	public String toString () 
	{
		return memory;
	}

	/**
	 * This method redeclares the value to nothing so they can be used again
	 * @param memory a string is set to nothing
	 * @param total an integer is set to zero
	 */
	public void clear() 
	{
		memory = "";
		total = 0;

	}
}
