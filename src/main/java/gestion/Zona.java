package gestion;

import java.util.*;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico[] zoo;
	private LinkedList<Animal> animales;
	
	public Zona () {
		
	}
	public Zona (String nombre, Zoologico[] zoo, LinkedList<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();		
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}                                                //sets y gets para todos los atributos - (animales)
	public String getNombre() {
		return nombre;
	}
	public void setZoologico(Zoologico zoo) {
		this.zoo[0] = zoo;
	}
	public Zoologico getZoologico() {
		return zoo[0];
	}
}
