package HistoricoFutbol;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
	private Integer numficha;
	private String nombre,apellidos,posicion;
	private int edad;
	private float sueldo;
	public Jugador(Integer numficha, String nombre, String apellidos, String posicion, int edad, float sueldo) {
		super();
		this.numficha = numficha;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posicion = posicion;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numficha);
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
		return Objects.equals(numficha, other.numficha);
	}
	public Integer getNumficha() {
		return numficha;
	}
	public void setNumficha(Integer numficha) {
		this.numficha = numficha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Jugador [numficha=" + numficha + ", nombre=" + nombre + ", apellidos=" + apellidos + ", posicion="
				+ posicion + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return this.numficha.compareTo(o.getNumficha());
	}
	
}
