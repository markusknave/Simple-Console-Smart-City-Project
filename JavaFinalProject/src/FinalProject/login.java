package FinalProject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class login {
	
	String filename = "e:\\JavaFinalProject\\acc.txt";
	Scanner enter = new Scanner(System.in);
	private static String _temp = null;
	
	//Class Constructor
	login (String username)
	{
		try
		{
			//Reads the acc.txt file
			Path path = Paths.get(filename.toString());
			InputStream input = Files.newInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			//User Input
			System.out.println("\n\t=====LOG IN=====".toUpperCase());
			System.out.println("");
			System.out.print("Enter username: ");
			username = enter.nextLine();
			System.out.print("Enter password: ");
			String password = enter.nextLine();
			
			//Attributes for the file reader loop
			String _user = null, _pass = null;
			boolean found = false;
			
			//Loop to check if the username and password match/exist in the acc.txt file
			while((_temp=reader.readLine()) != null)
			{
				String[] account = _temp.split(",");
				_user = account[0];
				_pass = account[1];
				
				if((_user.equalsIgnoreCase(username)) && _pass.equals(password))
				{
					found = true;
				}
			}
			
			if(found==true)
			{
				System.out.println("\n\t Welcome " + username +  "!");
				new mainMenu(username);
			}
			else
			{
				System.out.println("\n\tUsername and password does not match or exit! :(\n");
				new userAccount();
			}
		}
		catch(Exception Ex)
		{
			System.out.println(Ex.getMessage());
		}
	}
}
