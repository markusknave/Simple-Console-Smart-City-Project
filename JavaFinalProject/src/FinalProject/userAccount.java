package FinalProject;

	
	import java.util.*;

	public class userAccount {
		//Coded by Roemart Dacillo & Sean Pulma
		
		public static String username, email;
		private static String _temp = null;
		
		Scanner enter = new Scanner(System.in);
		
		//Class Constructor
		userAccount ()
		{
			try 
			{
				System.out.println("\t-=Tacloban Smart City Application=-\n");
				System.out.println("----------------------------------------------");
				System.out.println("\t1. Log in");
				System.out.println("\t2. Create Account");
				System.out.println("----------------------------------------------");
				System.out.println("");
				while(true) {
				System.out.print("Enter choice: ");
				String choice = enter.nextLine();
				
				switch(Integer.valueOf(choice)) {
					case 1:
						new login(username);
						_temp = "1";
						break;
					
					case 2:
						new register();
						_temp = "1";
						break;
					
					default:
						System.out.println("\n\tPlease select only from the listed options\n");
						_temp = "0";
						break;
					}
					//To break from the loop
					if(_temp.contentEquals("1")) {
						break;
					} 
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
		
		
		
		 