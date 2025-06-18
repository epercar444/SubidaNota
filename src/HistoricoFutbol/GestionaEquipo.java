package HistoricoFutbol;

import java.util.HashSet;
import java.util.Set;

public class GestionaEquipo {

	public static void main(String[] args) {
	    	Set<Jugador> jugadores1 = new HashSet<>();
	        Set<Jugador> jugadores2 = new HashSet<>();
	        Set<Jugador> jugadores3 = new HashSet<>();
	        Equipo equipo1 = new Equipo("Real Madrid","1902","2020",1,1000,jugadores1);
	        Equipo equipo2 = new Equipo("FC Barcelona","1899","2020",2,650_000_000f,jugadores2);
	        Equipo equipo3 = new Equipo("Atlético de Madrid","1903","2020",3,400_000_000f,jugadores3);
	        RepositorioEquipo u = new RepositorioEquipo();
	        u.añadirEquipo(equipo1);
	        u.añadirEquipo(equipo2);
	        u.añadirEquipo(equipo3);
	        System.out.println(u.getEquipos());
	        System.out.println(u.getEquipo("Real Madrid", "2020"));
	        System.out.println(u.getEquipo("Betis", "2026"));
	        
	        Jugador j1 = new Jugador(10, "Luka", "Modrić", "Centrocampista", 38, 200),
	                j2 = new Jugador(7, "Vinicius", "Júnior", "Delantero", 24, 350),
	                j3 = new Jugador(1, "Thibaut", "Courtois", "Portero", 33, 200);
	        try {
				u.añadirJugador("Real Madrid", "2020", j1);
				System.out.println(equipo1.getJugadores());
				u.añadirJugador("Real Madrid", "2020", j2);
				u.añadirJugador("Real Madrid", "2020", j3);
			} catch (FutbolExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        u.filtraPorEquipo("Real Madrid");
	        
	        System.out.println(u.devuelveCaro(equipo1));
	    }

	}


