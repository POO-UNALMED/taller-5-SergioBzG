package zooAnimales;

import gestion.*;

public class Ave extends Animal {
	private static int listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave () {
		this.listado++;
	}
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat); this.setGenero(genero); 
		this.colorPlumas = colorPlumas;
		this.listado++;
	}
	public static int cantidadAves() {
		return listado;
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave hawk = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return hawk;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave eagle = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return eagle;
	}
	public void setColorPlumas(String color) {
		this.colorPlumas = color;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
}
