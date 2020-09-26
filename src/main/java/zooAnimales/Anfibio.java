package zooAnimales;

import gestion.*;

public class Anfibio extends Animal {
	private static int listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio () {
		this.listado++;
	}
	public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat); this.setGenero(genero); 
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		this.listado++;
	}
	public static int cantidadAnfibios() {
		return listado;
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
}
