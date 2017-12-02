//Jason McDermott
//L00129269
//Games
//Assignment1
package ie.lyit.serialize;

import ie.lyit.hotel.Customer;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class CustomerSerializer 
{
	//The file which customers will be stored in
	final String FILENAME = "customers.bin";
	
	//Declares my customer Array List which will store customers
	private ArrayList<Customer> customers;
	
	//Default Constructor
	public CustomerSerializer()
	{
		//Constructs the "customers" Array List
		customers = new ArrayList<Customer>();
	}
	
	//Adds a customer to the customers Array List
	public void add()
	{
		//Creates a customer called c1
		Customer c1 = new Customer();
		
		c1.read();
		
		//Adds the customer c1 to the Array List
		customers.add(c1);
	}
	
	//Views a customer
	//When you enter a customer number, that customers details will show up
	public Customer view()
	{
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("Enter number of Customer: ");
		int customerToView = keyboardIn.nextInt();
		
		for(Customer tmpCustomer: customers)
		{
			if(tmpCustomer.getNumber() == customerToView)
			{
				System.out.println(tmpCustomer);
				return tmpCustomer;
			}
		}
		
		//If the customer wasn't found it returns nothing
		return null;
	}
	
	//Lists all the customers in the "customers" Array List
	public void list()
	{
		for(Customer tmpCustomer: customers)
		{
			System.out.println(tmpCustomer);
		}
	}
	
	//Edits a customers record
	public void edit()
	{
		Customer tempCustomer = view();
		
		if(tempCustomer != null) 
		{
			int index = customers.indexOf(tempCustomer);
			
			//tempCustomer.read();
			
			customers.set(index, tempCustomer);
		}
	}
	
	//Deletes a customer
	public void delete()
	{
		Customer tempCustomer = view();
		
		if(tempCustomer != null)
		{
			customers.remove(tempCustomer);
		}
	}
	
	//Stores customers into the "customer.bin" file
	public void writeRecordsToFile()
	{
		try
		{
			FileOutputStream filestream = new FileOutputStream(FILENAME);
			
			ObjectOutputStream outputStream = new ObjectOutputStream(filestream);
			
			outputStream.writeObject(customers);
			
			outputStream.close();
		}
		
		//Throws error if the "customer.bin" file can't be created
		catch(FileNotFoundException fileNotFound)
		{
			System.out.println("Can not create file to store customers");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//Gets the customers from the "customers.bin" file
	public void readRecordsFromFile()
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(FILENAME);
			
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			
			customers = (ArrayList<Customer>)objectInput.readObject();
			
			objectInput.close();
		}
		
		//Throws error if the "customer.bin" file isnt found
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot find customer file.");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
