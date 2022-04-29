package FinalProject;

import static java.nio.file.StandardOpenOption.APPEND;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class register {
	//Coded by Archie Cabus & Roemart Dacillo
	private static String Email, RegUser, RegPass1, RegAge, RegBirth, RegAddress, IndiChoose, RegYeal;
	Scanner enter = new Scanner(System.in);
	String filename = "e:\\JavaFinalProject\\acc.txt";
	
	register()
	{
		try 
		{
		
		//Accesses/opens the acc.txt file
		Path path = Paths.get(filename.toString());
		OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		
		//User Input
		System.out.println("\t=====create account=====".toUpperCase());
		System.out.println("");
      	System.out.println("\t**Account Detail**");
		System.out.println("------------------------------------------\n");
		System.out.print("Enter Email Address: ");
		Email = enter.nextLine();
		System.out.print("\nEnter New Username: ");
		RegUser = enter.nextLine();
		System.out.println();
		
		//Loop to check if password matches
		while (true) {
			System.out.print("Enter New Password: ");
			RegPass1 = enter.nextLine();
			System.out.print("Confirm New Password: ");
			String RegPass2 = enter.nextLine(); 
				if (RegPass2.contentEquals(RegPass1)) {
					break;
				} 
				else {
					System.out.println("\t**Password does not match!**");
					System.out.println();
				}
		}
		System.out.println("\n\t**Personal Information**");
		System.out.print("Enter Age: ");
		RegAge = enter.nextLine();
		System.out.print("Enter Birthdate(DD/MM/YY): ");
		RegBirth = enter.nextLine();
		System.out.print("Enter Full Address: ");
		RegAddress = enter.nextLine();
		System.out.println("\n------------------------------------------");
		System.out.println();
		
		System.out.print("\tType of Individual: \n\t[1] Tourist \n\t[2] Student \n");
		System.out.println();
		
		IndiChoose = null;
		System.out.print("Choose the type of Individual: ");
		String RegIndividual = enter.nextLine();
		System.out.println();
		switch (Integer.valueOf(RegIndividual)) {
			
			case 1:
				IndiChoose = "Tourist";
				break;
			case 2:
				IndiChoose = "Student";
				System.out.print("Year Level: ");
				RegYeal = enter.nextLine();
				break;
		}
		
		String Rewrite = null;
		System.out.println("------------------------------------------");
		System.out.print("\t\nSelect Option \n\t[1] Confirm Details \n\t[2] Re-Enter Details \n\t[3] Back to Home\n\n");
		System.out.println("------------------------------------------\n");
		System.out.print("Choose Option: ");
		String RegNum = enter.nextLine();
		System.out.println();
		switch (Integer.valueOf(RegNum)) {
		
			case 1:
				if (IndiChoose.contentEquals("Student")) {
					System.out.println("------------------------------------------");
					System.out.println("\t==Your Account has Successfully Registered==");
					Details1(Email, RegUser, RegPass1, RegAge, RegBirth, RegAddress, IndiChoose, RegYeal);
					System.out.println("------------------------------------------");
				}
				else {
					System.out.println("------------------------------------------");
					System.out.println("\t==Your Account has Successfully Registered==");
					Details2(Email, RegUser, RegPass1, RegAge, RegBirth, RegAddress, IndiChoose);
					System.out.println("------------------------------------------");
				}
				Rewrite = "stop";
				break;
				
			case 2:
				Rewrite = "redo";
				break;
				
			case 3:
				Rewrite = "home";
				break;
				}
		
			if(Rewrite.contentEquals("stop")) {
				writer.write(RegUser + "," + RegPass1 + "," + Email + "," + IndiChoose);
				writer.newLine();
				System.out.println("");
				System.out.println("Account has been created".toUpperCase());
				writer.close();
				output.close();
				new userAccount();
			}else if(Rewrite.contentEquals("redo")) {
				new register();
			}else {
				new userAccount();
			}
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			System.out.println("/n");
		}
	}
	 
//Function when the type of individual is a Student
public void Details1(String Email ,String RegUser,String RegPass1,String RegAge,String RegBirth,String RegAddress,String IndiChoose, String RegYeal) {
			
			System.out.println("\t\t**Account Detail**");
			System.out.println("\tUsername: " + RegUser);
			System.out.println("\tPassword: " + RegPass1);
			System.out.println("\tEmail: " + Email);
			System.out.println();
			System.out.println("\t\t**Information**");
			System.out.println("\tAge: " + RegAge);
			System.out.println("\tBirthDate: " + RegBirth);
			System.out.println("\tAddress: " + RegAddress);
			System.out.println();
			System.out.println("\tIndividual type: " + IndiChoose);
			System.out.println("\tYear Level: " + RegYeal);
			
				
			}
//Function when the type of individual is a Tourist
public void Details2(String Email, String RegUser,String RegPass1,String RegAge,String RegBirth,String RegAddress,String IndiChoose) {
				
			System.out.println("\t\t**Account Detail**");
			System.out.println("\tUsername: " + RegUser);
			System.out.println("\tPassword: " + RegPass1);
			System.out.println("\tEmail: " + Email);
			System.out.println();
			System.out.println("\t\t**Information**");
			System.out.println("\tAge: " + RegAge);
			System.out.println("\tBirthDate: " + RegBirth);
			System.out.println("\tAddress: " + RegAddress);
			System.out.println();
			System.out.println("\tIndividual type: " + IndiChoose);
			}
}

