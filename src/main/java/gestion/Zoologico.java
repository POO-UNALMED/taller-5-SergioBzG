package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private LinkedList<Zona> zonas = new LinkedList<Zona>();
	
	public Zoologico () {
		
	}
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre; 
		this.ubicacion = ubicacion; 
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for(int i = 0; i < zonas.size(); i++) {
			Zona elemento = zonas.pollFirst();
			cantidad +=  elemento.cantidadAnimales();
			zonas.addLast(elemento);
		}
		return cantidad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public LinkedList<Zona> getZona(){ 
		return zonas;
	}
}
