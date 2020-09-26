package zooAnimales;

import gestion.*;

public class Pez extends Animal {
	private static int listado;//Cambié la lista por una variable tipo entero
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {
		this.listado++;
	}
	public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat); this.setGenero(genero); 
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		this.listado++;
	}
	public static int cantidadPeces() {
		return listado;
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
}
