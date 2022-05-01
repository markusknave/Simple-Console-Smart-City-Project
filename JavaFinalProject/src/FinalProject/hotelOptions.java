package FinalProject;

import java.util.Scanner;

public class hotelOptions {
	
	//Class Constructor
	hotelOptions() {
		
		 Scanner numofpeople = new Scanner(System.in);
	     Scanner yesno = new Scanner(System.in);
	        
		    System.out.println("\n\tThis hotel is available for booking");
		    System.out.print("Amount of people who will check-in: ");
		    int people = numofpeople.nextInt(); 
		    
		    if (people >= 2){
		        System.out.println("\n Do you want your room to be seperated? \n [1]Yes \n [2]No");
		        int bool = yesno.nextInt();
		         
		            if (bool == 1){
		                System.out.println("\nYour room has been reserved seperately.");
		            }
		            else if (bool == 2){
		                System.out.println("\nYour room has been reserved.");
		            }
		             else{
		                System.out.println("\nPlease enter numbers 1 or 2 only.");
		            }
		    }
		    else{
		        System.out.print("\nYour room has been reserved.");
		    }
		    numofpeople.close();
		    yesno.close();
	}
}
