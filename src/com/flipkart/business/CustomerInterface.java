/**
 * 
 */
package com.flipkart.business;

/**
 * @author HP
 *
 */
public interface CustomerInterface {
	public void createCustomer(int custId, String custName, String custAdd);
	public void updateCustomer(int custId, String custName, String custAdd);
	public void listCustomer();
	public void deleteCustomer(int custId);
}