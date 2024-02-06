package Tarea3_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sesion {
		
	public static boolean login(String user, String password) {
		try {
			File myObj = new File("./assets/usuarios.txt");
			Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		    	String linea = myReader.nextLine();
		    	String[] campos = linea.split("#");
		    	if (user.equalsIgnoreCase(campos[0]) && password.equalsIgnoreCase(campos[1])) {
		    		return true;
		    	}
		    	
		    }
		    myReader.close();
		} catch (FileNotFoundException e) {

		}
		
		return false;
	}
}