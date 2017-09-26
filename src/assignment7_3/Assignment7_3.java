/**
 * 
 */
package assignment7_3;

/**
 * Java program to show how the capacity is changing in StringBuilder if we append the string.
 * 
 * Capacity Changes as per formula = intial_capacity*2+2
 * 
 * @author Sandeep
 *
 */
public class Assignment7_3 { // Class to show capacity change after adding String to Stringbuilder 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder(10); 	// Creating Stringbuilder Object with Capacity 10
		System.out.println("Initial Capacity of the String builder is :"+builder.capacity());
		
		int initial_capacity =builder.capacity();			// Assigning Intial capacity to Local variable
		
		String str = new String("abcdefghijk");				// Creating a String Object with length 11
		
		builder.append(str);								// Appending to String to String Builder
		
		int capacity= builder.capacity();					// Storing the capacity into Local variable
		
		System.out.println("Capacity as per formula:"+ ((initial_capacity*2)+2));	 // Printing the capacity dervice as per formuale
		System.out.println("Capacity after appending is "+capacity);				// Printing actual capacity

	}

}
