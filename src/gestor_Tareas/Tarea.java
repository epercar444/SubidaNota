package gestor_Tareas;

public class Tarea {
	private static int contador = 0;
	private int id, prioridad;
	private String descripcion, categoria;
	public Tarea(int prioridad, String descripcion, String categoria) {
		super();
		this.id = contador;
		contador = contador + 1;
		this.prioridad = prioridad;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
