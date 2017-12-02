package ie.lyit.testers;

import ie.lyit.hotel.Date;
import java.util.Scanner;

public class DateTester{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Date d1 = new Date();
        //System.out.println(d1); 

	    //d1.setDay(4);
		//d1.setMonth(6);
		//d1.setYear(1941);
		
		//System.out.println(d1);
      
		//Date d2 = new Date(28, 12, 1982);
        //System.out.println(d2);
      
		//if(d1.equals(d2))
			//System.out.println("Date's are equal.");
		//else
			//System.out.println("Date's are not equal.");
		
		/* Date myDate1 = new Date();
        Date myDate2 = new Date(28,11,1982);
        */
        
        int setDayTo = 32, setMonthTo = 13, setYearTo = 1899;
        boolean goodInput = false;
        
        /*do {
		      try {  
	        	myDate1.setDay(setDayTo);
		        myDate1.setMonth(setMonthTo);
		        myDate1.setYear(setYearTo);
		      }
		      catch(IllegalArgumentException iEA)
		      {
		    	  System.out.println("Incorrect Day, Month or Year");
		    	  
		    	  System.out.println("Re-enter valid argument for day");
		    	  setDayTo = keyboard.nextInt();
		    	  System.out.println("Re-enter valid argument for month");
		    	  setMonthTo = keyboard.nextInt();
		    	  System.out.println("Re-enter valid argument for year");
		    	  setYearTo = keyboard.nextInt();
		      }
        }
        while(!goodInput); */
        
        
        do {
		      try {  
		    	  Date myDate3 = new Date(33,13,1899);
		      }
		      catch(IllegalArgumentException iEA)
		      {
		    	  System.out.println("Incorrect Day, Month or Year");
		    	  
		    	  System.out.println("Re-enter valid argument for day");
		    	  setDayTo = keyboard.nextInt();
		    	  System.out.println("Re-enter valid argument for month");
		    	  setMonthTo = keyboard.nextInt();
		    	  System.out.println("Re-enter valid argument for year");
		    	  setYearTo = keyboard.nextInt();
		      }
      }
      while(!goodInput);
   }
}
