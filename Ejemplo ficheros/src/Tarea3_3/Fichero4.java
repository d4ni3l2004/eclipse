package Tarea3_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nuevo alumno: ");
		String texto = sc.nextLine().trim();
		
		boolean resultado = insertarAlumno(texto);
		if (resultado) {
			System.out.println("Alumno insertado con exito!");
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}
	
	public static boolean insertarAlumno(String alu) {
		try {
		      FileWriter myWriter = new FileWriter("./assets/alumnos1DAM.txt", true);
		      myWriter.write("\n" + alu);
		      myWriter.close();
		    } catch (IOException e) {
		    	return false;
		    }
		
		return true;
	}
}