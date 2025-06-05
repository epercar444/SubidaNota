package Boletin3Colecciones;

import java.util.Arrays;

public class Dia {
	String nombreDia;
	String [] horas;
	public String getNombreDia() {
		return nombreDia;
	}
	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}
	public String[] getHoras() {
		return horas;
	}
	public void setHoras(String[] horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Dia [nombreDia=" + nombreDia + ", horas=" + Arrays.toString(horas) + "]";
	}
	public Dia(String nombreDia, String[] horas) {
		super();
		this.nombreDia = nombreDia;
		this.horas = new String[6];
	}
	
}
