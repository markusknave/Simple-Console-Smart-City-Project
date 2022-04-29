  package FinalProject;

import java.util.Scanner;

public class touristMenu {
	//Coded by Jashmer Benaso
	
	//Function called if Indichoose = Tourist
	public static void choiceT() {
		
		//To ignore unnecessary warnings
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		//Choice attributes
		int choice;
		String option="", option1="yes", option2="no";
		
		while (true) {
		System.out.println("\nWhat Do You Want? \n 1. Hotel \n 2. Restaurant \n 3. Log Out");
		choice=input.nextInt();
		System.out.println();
		
		//Hotel Choices
		if (choice == 1) {
			
			System.out.println();
			int hotel = input.nextInt();
			
			
			if (hotel == 1) {
				System.out.println("\nTacloban Plaza Hotel "); 
				System.out.println("\nDo you want to check-in to this Hotel? Yes or No");
				option=input.next();
				if(option.equals(option1)){
				System.out.println("\nLocation: Justice Romualdez St., 6500 Tacloban City, Philippines \nContact Number: 0917-593-4429 \n Website: http://www.taclobanplazahotel.com.ph/");
				new hotelOptions();
				}
				else if(option.equals(option2)) {
					System.out.println();	
					
				}
				else {
					System.out.print("\nInput Error");
				}


			} if (hotel == 2) {
				System.out.println("\nHotel XYZ ");
				System.out.println("\nDo you want to check-in to this Hotel? Yes or No");
				option=input.next();
				if(option.equals(option1)){
			    System.out.println("\nLocation: P. Zamora St., Tacloban City, Philippines \nContact Number: +639177738008 \nFacebook Link: https://www.facebook.com/hotelxyz.tacloban/");
			    new hotelOptions();
				}
				else if(option.equals(option2)) {
					System.out.println();
					
				}
				else {
					System.out.print("\nInput Error");
				}
			} if (hotel == 3) {
				System.out.println("\nBasic Rooms Budget Hotel Tacloban ");
				System.out.println("\nDo you want to check-in to this Hotel? Yes or No");
				option=input.next();
				if(option.equals(option1)){
			    System.out.println("\nLocation: Real St. Sagkahan, Tacloban City, Leyte, Philippines \nContact Number: 09153063283/09477982533 \nFacebook Link: https://www.facebook.com/BudgetHotelTacloban/");
			    new hotelOptions();
				}
				else if(option.equals(option2)) {
					System.out.println();
					
				}
				else {
					System.out.print("\nInput Error");
					}
				
			}if (hotel == 4) {
				System.out.println("\nHotel Estrella ");
				System.out.println("\nDo you want to check-in to this Hotel? Yes or No");
				option=input.next();
				if(option.equals(option1)){
			    System.out.println("\nLocation: Cor. Real St. and Independencia St., Tacloban City, Philippines \nContact Number: 0995 274 6269 \nWebsite: hotelestrellatacloban.com");
			    new hotelOptions();
				}
				else if(option.equals(option2)) {
					System.out.println();
					
				}
				else {
					System.out.print("\nInput Error");
					}
				
			} if (hotel == 5) {
				System.out.println("\nIronwood Hotel ");
				System.out.println("\nDo you want to check-in to this Hotel? Yes or No");
				option=input.next();
				if(option.equals(option1)){
			    System.out.println("\nLocation: Cor. P. Burgos and Juan Luna St., 6500 Tacloban City, Philippines \nContact Number: 0998 857 1857 \nWebsite: http://ironwoodhotel.com/");
			    new hotelOptions();
			}
				else if(option.equals(option2)) {
					System.out.println();
					
				}
				else {
					System.out.print("\nInput Error");
					}
				}
			}
 
 //Restaurant Choices
 if (choice == 2) { 
	System.out.println("Choose your Restuarant: \n 1.) Ochó Seafood and Grill \n 2.) Fahrenheit Food Center "
			+ "\n 3.) Pedro Modern Filipino Restaurant  \n 4.) Firegrass Tavern \n 5.) Gerry's Grill\n 6.) TIMO ROMANO LECHON ");
	System.out.println();
	int restuarant = input.nextInt();
	
	if (restuarant == 1) {
		System.out.println("\nOcho Seafood and Grill "); 
		System.out.println("\nDo you want to visit this Restuarant? Yes or No");
		option=input.next();
		if(option.equals(option1)){
		System.out.println("\nAddress: Senator Enage St, Downtown, Tacloban City, 6500 Leyte");
		}
		else if(option.equals(option2)) {
			System.out.println();	
		}
		else {
			System.out.print("\nInput Error");
		}}
	
		if (restuarant == 2) {
			System.out.println("\nFahrenheit Food Center"); 
			System.out.println("\nDo you want to visit this Restuarant? Yes or No");
			option=input.next();
			if(option.equals(option1)){
			System.out.println("\nAddress: Del Pilar St., Downtown, Tacloban City, 6500 Leyte");
			}
			else if(option.equals(option2)) {
				System.out.println();	
			}
			else {
				System.out.print("\nInput Error");
			}}
		
			if (restuarant == 3) {
				System.out.println("\nPedro Modern Filipino Restaurantl "); 
				System.out.println("\nDo you want to visit this Restuarant? Yes or No");
				option=input.next();
				if(option.equals(option1)){
				System.out.println("\nAddress: Lot 1243-e-3-b Brgy. 83-A Burayan, San Jose, Tacloban City, 6500 Leyte");
				}
				else if(option.equals(option2)) {
					System.out.println();	
				}
				else {
					System.out.print("\nInput Error");
				}}
			
				if (restuarant == 4) {
					System.out.println("\nFiregrass Tavern "); 
					System.out.println("\nDo you want to visit this Restuarant? Yes or No");
					option=input.next();
					if(option.equals(option1)){
					System.out.println("\nAddress: 203 Paterno St, Downtown, Tacloban City, Leyte");
					}
					else if(option.equals(option2)) {
						System.out.println();	
					}
					else {
						System.out.print("\nInput Error");
					}}
				
				if (restuarant == 5) {
					System.out.println("\nGerry's Grill "); 
					System.out.println("\nDo you want to visit this Restuarant? Yes or No");
					option=input.next();
					if(option.equals(option1)){
					System.out.println("\nAddress: Ground Floor, Robinsons Place, 77 Tacloban - Baybay S Rd, Barangay, Marasbaras, Tacloban City, 6500 Leyte");
					}
					else if(option.equals(option2)) {
						System.out.println();	
					}
					else {
						System.out.print("\nInput Error");
					}}
					if (restuarant == 6) {
						System.out.println("\nTIMO ROMANO LECHON "); 
						System.out.println("\nDo you want to visit this Restuarant? Yes or No");
						option=input.next();
						if(option.equals(option1)){
						System.out.println("\nAddress: 647 Real St, Tacloban City, 6500 Leyte ");
						}
						else if(option.equals(option2)) {
							System.out.println();	
						}
						else {
							System.out.print("\nInput Error");
						}
					}
				
					}
 
 				//To Logout
 				if(choice == 3) {
 					System.out.println("\tlogging out".toUpperCase() + "\n");
 					new userAccount();
 					break;
 					}
				}
			}
}