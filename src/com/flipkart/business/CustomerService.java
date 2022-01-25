/**
 * 
 */
package com.flipkart.business;

import java.util.ArrayList;

import com.flipkart.bean.Customer;

/**
 * @author HP
 *
 */
public class CustomerService implements CustomerInterface{
	//The service class implementing all the operations for creating, updating and deleting the customers
	
	//Customer customer = new Customer();
	ArrayList<Customer> myCustomers = new ArrayList<Customer>();
	
	
	public void createCustomer(int custId, String custName, String custAdd) {
		Customer tmp = new Customer();
		tmp.setCustomerId(custId);
		tmp.setCustomerName(custName);
		tmp.setCustomerAddress(custAdd);
		myCustomers.add(tmp);
		System.out.println("Customer added successfully!!");
	}
	
	public void updateCustomer(int custId, String custName, String custAdd) {
		
		boolean flag = false;
		int index = 0;
		for(Customer cust: myCustomers)
		{
			if(cust.getCustomerId()==custId)
			{
				index = myCustomers.indexOf(cust);
				flag = true;
				break;
			}
		}
		if(flag)
		{
			myCustomers.get(index).setCustomerName(custName);
			myCustomers.get(index).setCustomerAddress(custAdd);
			System.out.println("Customer details updated successfully");
		}
		else
			System.out.println("Customer not found");
	}
	public void listCustomer() {
		
		System.out.println("Customer Id\t\tCustomer Name\t\tCustomer Address");
		for(Customer cust: myCustomers)
		{
			System.out.println(cust.getCustomerId()+"\t\t\t"+cust.getCustomerName()+"\t\t\t"+cust.getCustomerAddress());
		}
		
	}
	public void deleteCustomer(int custId) {
		
		boolean flag = false;
		Customer tmp = null;
		for(Customer cust: myCustomers)
		{
			if(cust.getCustomerId()==custId)
			{
				tmp = cust;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			myCustomers.remove(tmp);
			System.out.println("Customer with customer id: "+custId+" is deleted");
		}
		else
			System.out.println("Customer not found");
	}
}