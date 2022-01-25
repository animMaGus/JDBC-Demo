/**
 * 
 */
package com.flipkart.array;

/**
 * @author Mehak Goel
 *
 */
public class DemoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Demo of primitive type	
		int arrayOfInt[] = new int[] {2, 3, 5};
	       for (int i = 0; i < arrayOfInt.length; i++) {
	        System.out.println("The " + i + " element has value  : " + arrayOfInt[i]);
	       }
	       
	       String names[] = new String[] {"Shakir", "Priyanka", "Sumeet"};
	       
	       for (int i = 0; i < names.length; i++) {
	         System.out.println("The " + i + " name is : " + names[i]);
	       }
	       
	       String departmentNames[] = new String[5];
	       
	       departmentNames[0] = "Accounts";
	       departmentNames[1] = "H.R.";
	       departmentNames[2] = "I.T";
	       departmentNames[3] = "P.R.";
	       departmentNames[4] = "Sales";
	       
	       for (int i = 0; i < departmentNames.length; i++) {
	    	   
	    	   System.out.println(departmentNames[i]);
	       }
	}

}
