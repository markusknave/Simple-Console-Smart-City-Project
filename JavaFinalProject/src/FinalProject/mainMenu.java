package FinalProject;


import java.nio.file.*;
import java.io.*;


public class mainMenu {

	static String filename = "e:\\JavaFinalProject\\acc.txt";
	private static String _temp = null;
	
	mainMenu(String username) {
		
		//Attributes for file reader
		String _user, _type;
		
		//Reads the acc.txt file 
		Path path = Paths.get(filename.toString());
		InputStream input;
		try {
			input = Files.newInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			//Loop to check what type of individual is the account
			while((_temp=reader.readLine()) != null)
			{
				String[] account = _temp.split(",");
				_user = account[0];
				_type = account[3];
				if(_user.equalsIgnoreCase(username)){
					if(_type.equalsIgnoreCase("student")) {
						studentMenu.choiceS();
					} else if(_type.equalsIgnoreCase("tourist")) {
						touristMenu.choiceT();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
