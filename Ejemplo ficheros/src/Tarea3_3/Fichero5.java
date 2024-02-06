package Tarea3_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nuevo articulo\n----------------------- ");
		System.out.println("Nombre: ");
		String nombre = sc.nextLine().trim();
		
		System.out.println("Precio: ");
		double precio = Double.parseDouble(sc.nextLine().trim());
		
		System.out.println("Descripcion: ");
		String descripcion = sc.nextLine().trim();
		
		Articulo nuevoArticulo = new Articulo(nombre, precio, descripcion);
		
		boolean resultado = insertarArticulo(nuevoArticulo);
		if (resultado) {
			System.out.println("Articulo insertado con exito!");
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}
	
	public static boolean insertarArticulo(Articulo art) {
		String nuevaLinea = art.getNombre() + "@" + art.getPrecio() + "@" + art.getDescripcion();
		try {
		      FileWriter myWriter = new FileWriter("./assets/articulos.txt", true);
		      myWriter.write("\n" + nuevaLinea);
		      myWriter.close();
		    } catch (IOException e) {
		    	return false;
		    }
		
		return true;
	}
}