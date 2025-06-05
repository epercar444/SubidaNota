package Boletin3Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
	int aula;
	List<Dia> horario;
	public Tutor(int aula, List<Dia> horario) {
		super();
		this.aula = aula;
		this.horario = new ArrayList<Dia>();
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	public List<Dia> getHorario() {
		return horario;
	}
	public void setHorario(List<Dia> horario) {
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "Tutor [aula=" + aula + ", horario=" + horario + "]";
	}
	
	
}
