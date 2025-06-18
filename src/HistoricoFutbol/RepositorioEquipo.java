package HistoricoFutbol;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RepositorioEquipo {
	Set<Equipo> equipos;

	public RepositorioEquipo() {
		super();
		this.equipos = new HashSet<Equipo>();
	}

	public Set<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "RepositorioEquipo [equipos=" + equipos + "]";
	}
	
	public void añadirEquipo (Equipo e) {
		equipos.add(e);
	}
	
	public Equipo getEquipo(String nombre, String anyo) {
		Equipo e = null;
		Iterator<Equipo> it = equipos.iterator();
		while (it.hasNext()) {
			Equipo l = it.next();
			if (l.getAnyo_inicio().equals(anyo) && l.getNombre().equals(nombre)) {
				e = l;
			}
		}
		return e;
	}
	
	public void añadirJugador (String nombre, String anyo, Jugador e) throws FutbolExcepcion{
		Equipo equipo = getEquipo (nombre,anyo);
		boolean contiene = contieneJugador (equipo,e);
		if (equipo.getPresupuesto() > e.getSueldo()) {
			if (!contiene) {
			equipo.getJugadores().add(e);
			equipo.setPresupuesto(equipo.getPresupuesto() - e.getSueldo());
			}
		}
		else {
			throw new FutbolExcepcion ("El equipo " + equipo.getNombre() + " no tiene presupuesto suficiente para dicho jugador");
		}
	}
	
	public boolean contieneJugador (Equipo f, Jugador e) throws FutbolExcepcion {
		boolean contiene = false;
		if (f.getJugadores().contains(e)) {
			contiene = true;
			throw new FutbolExcepcion ("El jugador ya está en la lista de equipos");
		}
		return contiene;
	}
	
	public void filtraPorEquipo (String nombre) {
		Iterator<Equipo> it = equipos.iterator();
		while (it.hasNext()) {
			Equipo l = it.next();
			if (l.getNombre().equals(nombre)) {
				for (Jugador j: l.getJugadores()) {
					System.out.println(j.getNombre());
					System.out.println(j.getSueldo());
				}
			}
	}
}
	public Jugador devuelveCaro (Equipo e) {
		Jugador r = null;
		float max = 0;
		for (Jugador f: e.getJugadores()) {
			if (f.getSueldo() > max) {
				max = f.getSueldo(); 
				r = f;
			}
		}
		return r;
	}
}
