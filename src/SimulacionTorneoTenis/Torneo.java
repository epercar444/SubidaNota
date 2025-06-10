package SimulacionTorneoTenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Torneo {
	Set<Jugador> jugadores;
	List<Partido> partidos;
	public Torneo(Set<Jugador> jugadores, List<Partido> partidos) {
		super();
		this.jugadores = new HashSet<Jugador>();
		this.partidos = new ArrayList<Partido>();
	}
	
	void agregarJugador(Jugador j) throws ExcepcionTorneo {
		if (jugadores.contains(j)) {
			throw new ExcepcionTorneo ("El jugador ya está inscrito en el torneo");
		}
		else {
			jugadores.add(j);
		}
	}
	
	void registrarPartido (Partido p) {
		partidos.add(p);
	}
	
	void mostrarJugadores () {
		
	}
}

