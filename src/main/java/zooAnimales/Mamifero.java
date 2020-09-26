package zooAnimales;

import gestion.*;

public class Mamifero extends Animal {
	private static int listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero () {
		this.listado++;
	}
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat); this.setGenero(genero); 
		this.pelaje = pelaje;
		this.patas = patas;
		this.listado++;
	}
	public static int cantidadMamiferos() {
		return listado;
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero horse = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return horse;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero lion = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return lion;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas() {
		return patas;
	}
}
