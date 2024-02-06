package Tarea3_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	public static void main(String[] args) {
		String[] listaNombre = obtenerLineas();
		System.out.println("Listado de alumnos de DAM\n-----------------------------");
		for (int i = 0; i < listaNombre.length; i++) {
			System.out.println(listaNombre[i]);
		}
		Articulo[] listaArticulos = obtenerArticulos();
		System.out.println("Listado de articulos\n-----------------------------");
		for (int i = 0; i < listaArticulos.length; i++) {
			System.out.println("\nArticulo " + (i+1));
			System.out.println("Nombre: " + listaArticulos[i].getNombre());
			System.out.println("Precio: " + listaArticulos[i].getPrecio());
			System.out.println("Descripcion: " + listaArticulos[i].getDescripcion());
		}
	}
	
	public static String[] obtenerLineas() {
		ArrayList<String> lista = new ArrayList<String>();
		try {
			File myObj = new File("./assets/alumnos1DAM.txt");
			Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		    	String linea = myReader.nextLine();
		    	lista.add(linea);
		    }
		    myReader.close();
		} catch (FileNotFoundException e) {
		    System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		String[] array = new String[lista.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = lista.get(i);
		}
		return array;
	}
	
	public static Articulo[] obtenerArticulos() {
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		try {
			File myObj = new File("./assets/articulos.txt");
			Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		    	String linea = myReader.nextLine();
		    	String[] campos = linea.split("@");
		    	
		    	Articulo art = new Articulo();
		    	art.setNombre(campos[0]);
		    	art.setPrecio(Double.parseDouble(campos[1]));
		    	art.setDescripcion(campos[2]);
		    	
		    	lista.add(art);
		    }
		    myReader.close();
		} catch (FileNotFoundException e) {
		    System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		Articulo[] array = new Articulo[lista.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = lista.get(i);
		}
		return array;
	}
}