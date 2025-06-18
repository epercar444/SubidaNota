package HistoricoFutbol;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Equipo {
	private String nombre,fundacion,anyo_inicio;
	private int posicion_final;
	private float presupuesto;
	private Set<Jugador> jugadores;
	public Equipo(String nombre, String fundacion, String anyo_inicio, int posicion_final, float presupuesto,
			Set<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.fundacion = fundacion;
		this.anyo_inicio = anyo_inicio;
		this.posicion_final = posicion_final;
		this.presupuesto = presupuesto;
		this.jugadores = new HashSet<Jugador>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFundacion() {
		return fundacion;
	}
	public void setFundacion(String fundacion) {
		this.fundacion = fundacion;
	}
	public String getAnyo_inicio() {
		return anyo_inicio;
	}
	public void setAnyo_inicio(String anyo_inicio) {
		this.anyo_inicio = anyo_inicio;
	}
	public int getPosicion_final() {
		return posicion_final;
	}
	public void setPosicion_final(int posicion_final) {
		this.posicion_final = posicion_final;
	}
	public float getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Set<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anyo_inicio, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(anyo_inicio, other.anyo_inicio) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", fundacion=" + fundacion + ", anyo_inicio=" + anyo_inicio
				+ ", posicion_final=" + posicion_final + ", presupuesto=" + presupuesto + ", jugadores=" + jugadores
				+ "]";
	}
	
	
	
}
