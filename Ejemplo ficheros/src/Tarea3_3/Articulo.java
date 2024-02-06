package Tarea3_3;

public class Articulo {
	private String nombre;
	private double precio;
	private String descripcion;
	
	public Articulo() {
		
	}
	
	public Articulo(String nombre, double precio, String descripcion) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setDescripcion(descripcion);
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	//Setters
	
	public void setNombre(String nombre) {
		if(nombre.length() > 0) {
			this.nombre = nombre;
		}
	}
	
	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}
	
	public void setDescripcion(String descripcion) {
		if(descripcion.length() > 0) {
			this.descripcion = descripcion;
		}
	}
}