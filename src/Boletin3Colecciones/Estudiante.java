package Boletin3Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	String nombre;
	int id;
	List<Integer> notas;
	public Estudiante(String nombre, int id, List<Integer> notas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.notas = new ArrayList<Integer>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Integer> getNotas() {
		return notas;
	}
	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", id=" + id + ", notas=" + notas + "]";
	}
	
	
	}

