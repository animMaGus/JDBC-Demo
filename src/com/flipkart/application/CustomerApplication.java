/**
 * 
 */
package com.flipkart.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.flipkart.bean.Customer;
import com.flipkart.business.CustomerInterface;
import com.flipkart.business.CustomerService;

/**
 * @author HP
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the instance of customer service
		//CustomerService service = new CustomerService();
		CustomerInterface service = new CustomerService();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the following options to avail the customer services:-");
		System.out.println("1 : Create a new customer\n2 : Delete a customer\n3 : List all the customers\n4 : Update the customer info\n5 : Quit");
		while(2>1)
		{
			System.out.print("Enter Choice number: ");
			int choice = scanner.nextInt();
			if(choice==5)
				break;
			int custId;
			String custName,custAdd;
			switch(choice)
			{
				case 1: System.out.print("Enter Customer Id: ");
						custId = scanner.nextInt();
						System.out.print("Enter Customer Name: ");
						custName = scanner.next();
						System.out.print("Enter Customer Address: ");
						custAdd = scanner.next();
						service.createCustomer(custId,custName,custAdd);
						break;
				case 2: System.out.print("Enter Customer Id: ");
						custId = scanner.nextInt();
						service.deleteCustomer(custId);
						break;
				case 3: service.listCustomer();
						break;
				case 4: System.out.print("Enter Customer Id: ");
						custId = scanner.nextInt();
						System.out.print("Enter Customer Name: ");
						custName = scanner.next();
						System.out.print("Enter Customer Address: ");
						custAdd = scanner.next();
						service.updateCustomer(custId,custName,custAdd);
						break;
				default: System.out.println("Invalid Input");
			}
		}
		return;
	}

}