package Boletin3Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	int id;
	String descripcion;
	List<Estudiante> estudiantes;
	Tutor tutor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	public Grupo(int id, String descripcion, List<Estudiante> estudiantes, Tutor tutor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estudiantes = new ArrayList<Estudiante>();
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		return "Grupo [descripcion=" + descripcion + ", estudiantes=" + estudiantes + ", tutor=" + tutor
				+ "]";
	}
	
}
