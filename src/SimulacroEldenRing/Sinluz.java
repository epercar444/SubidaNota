package SimulacroEldenRing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sinluz implements Comparable<Sinluz>{
	private static int contador = 0;
	private int id;
	private String nombre;
	private List<Encuentro> encuentros; //he elegido esta estructura porque es la más facil de utilizar y porque no nos piden orden.
	
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Encuentro> getEncuentros() {
		return encuentros;
	}
	public void setEncuentros(List<Encuentro> encuentros) {
		this.encuentros = encuentros;
	}
	public Sinluz(String nombre) {
		super();
		this.contador++;
		this.id = id+contador;
		this.nombre = nombre;
		this.encuentros = new ArrayList<Encuentro>();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinluz other = (Sinluz) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "SinLuz [id=" + id + ", nombre=" + nombre + ", encuentros=" + encuentros
				+ "]";
	}
	@Override
	public int compareTo(Sinluz o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	
	
}
