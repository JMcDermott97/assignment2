//L00129269
//Jason McDermott
//Games

package ie.lyit.testers;

import ie.lyit.serialize.CustomerSerializer;

import ie.lyit.hotel.Customer;

import ie.lyit.hotel.CustomerMenu;

public class CustomerSerializerTester 
{
	public static void main(String args[])
	{
		CustomerSerializer customerFileHandler = new CustomerSerializer();
		
		customerFileHandler.readRecordsFromFile();
		
		CustomerMenu menuObj = new CustomerMenu();
		
		do
		{
			menuObj.display();
			
			menuObj.readOption();
			
			switch(menuObj.getOption())
			{
			   case 1:customerFileHandler.add();break;
			   case 2:customerFileHandler.list();break;
			   case 3:customerFileHandler.view();break;
			   case 4:customerFileHandler.edit();break;
			   case 5:customerFileHandler.delete();break;
			   case 6:break;				
			   default:System.out.println("INVALID OPTION...");
			}
	    }while(menuObj.getOption() != 6);	
																		
		
	customerFileHandler.writeRecordsToFile();
	}
}
