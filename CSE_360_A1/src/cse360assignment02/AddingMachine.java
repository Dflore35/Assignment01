// Assignment #1: Arizona State University CSE360
//         Name: Diana Flores
//    StudentID: 1214750485
//      Lecture: T 9 am
//  Description: Assignment one helps us get familar with git hub.

//test1 
package cse360assignment02;

public class AddingMachine 
{

	private int total; //declares the varible
	private String memory; // holds the memory of the assignment

	public AddingMachine() 
	{
		total = 0;  // initializing total to zero
		memory = "0"; // the first memory is  zero 
	}

	public int getTotal ()
	{
		return total; //returns the total 
	}

	//this method adds a value to total 
	public void add (int value) 
	{
		total = total + value;
		memory = memory + " + " + value; // adds this operation to the memory
	}
	//this method subtracts from the total 
	public void subtract (int value) 
	{
		total = total - value;
		memory = memory + " - " + value; //adds the subtracts the operation to the memory
	}

	//this method returns a string 
	public String toString () 
	{
		return memory;
	}

	//this method erases the memory
	public void clear() 
	{
		memory = "";
		total = 0;

	}


}
