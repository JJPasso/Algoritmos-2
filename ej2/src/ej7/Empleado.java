package ej7;

public class Empleado {
	private int numero;
	private String nombre;
	public int getNumero() {
		return (this.numero);
	}
	public String getNombre() {
		return (this.nombre);
	}
	public void setNumero(int num) {
		this.numero = num;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public void verDatos() {
		System.out.println("el nombre del empleado: "+ this.nombre +"y su numero es: "+ this.numero);
	}
}
