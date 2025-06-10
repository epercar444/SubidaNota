package SimulacionTorneoTenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Partido {
	Jugador jugador1;
	Jugador jugador2;
	EstadoTorneo estado;
	LocalDate fechaPartido;
	List<Integer> puntuaciones1;
	List<Integer> puntuaciones2;
	public Partido(Jugador jugador1, Jugador jugador2, EstadoTorneo estado, LocalDate fechaPartido,
			List<Integer> puntuaciones1, List<Integer> puntuaciones2) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.estado = estado;
		this.fechaPartido = fechaPartido;
		this.puntuaciones1 = new ArrayList<Integer>();
		this.puntuaciones2 = new ArrayList<Integer>();
	}
	@Override
	public int hashCode() {
		return Objects.hash(estado, fechaPartido, jugador1, jugador2, puntuaciones1, puntuaciones2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return estado == other.estado && Objects.equals(fechaPartido, other.fechaPartido)
				&& Objects.equals(jugador1, other.jugador1) && Objects.equals(jugador2, other.jugador2)
				&& Objects.equals(puntuaciones1, other.puntuaciones1)
				&& Objects.equals(puntuaciones2, other.puntuaciones2);
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	public EstadoTorneo getEstado() {
		return estado;
	}
	public void setEstado(EstadoTorneo estado) {
		this.estado = estado;
	}
	public LocalDate getFechaPartido() {
		return fechaPartido;
	}
	public void setFechaPartido(LocalDate fechaPartido) {
		this.fechaPartido = fechaPartido;
	}
	public List<Integer> getPuntuaciones1() {
		return puntuaciones1;
	}
	public void setPuntuaciones1(List<Integer> puntuaciones1) {
		this.puntuaciones1 = puntuaciones1;
	}
	public List<Integer> getPuntuaciones2() {
		return puntuaciones2;
	}
	public void setPuntuaciones2(List<Integer> puntuaciones2) {
		this.puntuaciones2 = puntuaciones2;
	}
	@Override
	public String toString() {
		return "Partido [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", estado=" + estado + ", fechaPartido="
				+ fechaPartido + ", puntuaciones1=" + puntuaciones1 + ", puntuaciones2=" + puntuaciones2 + "]";
	}
	
	
}
