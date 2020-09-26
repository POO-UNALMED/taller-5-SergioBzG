package zooAnimales;

import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	
	public Animal () {
		this.totalAnimales++;
	}
	public Animal (String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.totalAnimales++;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return ("Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " + Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles()
		+ "\n" + "Peces: " + Pez.cantidadPeces() + "\n" + "Anfibios: " + Anfibio.cantidadAnfibios());
	}
	public String toString() {
		if(zona.length == 0) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " +
					genero;
		}
		else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " +
			genero + ", la zona en la que me ubico es " + zona[0] + ", en el " + zona[0].getZoo();
		}
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}                                                    
	public String getHabitat() {
		return habitat;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setZona(Zona zona) {
		this.zona[0] = zona;
	}
	public Zona getZona() {
		return zona[0];
	}
}
