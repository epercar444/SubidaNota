package SimulacionTorneoTenis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jugador {
	static int contador = 0;
	String nombre, apellido,nacionalidad;
	int rankingTorneo;
	List<Partido> partidosJugados;
	int id;
	public Jugador(String nombre, String apellido, String nacionalidad, int rankingTorneo,
			List<Partido> partidosJugados) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.rankingTorneo = rankingTorneo;
		this.partidosJugados = new ArrayList<Partido>();
		this.id = contador;
		contador = contador + 1;
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
		Jugador other = (Jugador) obj;
		return id == other.id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getRankingTorneo() {
		return rankingTorneo;
	}
	public void setRankingTorneo(int rankingTorneo) {
		this.rankingTorneo = rankingTorneo;
	}
	public List<Partido> getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(List<Partido> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ ", rankingTorneo=" + rankingTorneo + ", partidosJugados=" + partidosJugados + ", id=" + id + "]";
	}
	
	
	
}
