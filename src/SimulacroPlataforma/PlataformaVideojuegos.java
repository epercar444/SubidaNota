package SimulacroPlataforma;

import java.util.*;
import java.util.Map.Entry;
public class PlataformaVideojuegos {

    Map<Juego,EstudioDesarrollo> juegos;
	// He elegido esta estructura ya que se desea guardar los datos de una pareja al igual que en otros ejercicios en clase por lo que me parece la estructura más correcta.Igualmente elegido el HashMap porque es la estrctura más eficiente y qeu no permite repetidos.
    public PlataformaVideojuegos() {
    	this.juegos = new HashMap<Juego, EstudioDesarrollo>();
    }

    public Map<Juego, EstudioDesarrollo> getJuegos() {
		return juegos;
	}

	public void setJuegos(Map<Juego, EstudioDesarrollo> juegos) {
		this.juegos = juegos;
	}

	public void agregarJuego(Juego juego, EstudioDesarrollo estudio) {
    	juegos.put(juego, estudio);
    }

    public Juego buscarJuego(String titulo, String añoPublicacion) {
       Juego juego = null;
    	for (Juego f : juegos.keySet()) {
    		if (f.getTitulo().equals(titulo) && f.getAñoPublicacion().equals(añoPublicacion)) {
    			juego = f;
    		}
    	}
        return juego;
    }

    public boolean cambiarEstado(String titulo, String añoPublicacion, EstadoJuego nuevoEstado) {
    	boolean modificado = false;
    	Juego f = buscarJuego(titulo,añoPublicacion);
    		if (f != null) {
    			f.setEstado(nuevoEstado);
    			modificado = true;
    		}
        return modificado;
    }

    public List<Juego> top3PorDescargas() {
   	    	Juego primero = null;
    	    Juego segundo = null;
    	    Juego tercero = null;

    	    for (Juego juego : juegos.keySet()) {
    	        int descargas = juego.getNumDescargas();

    	        if (primero == null || descargas > primero.getNumDescargas()) {
    	            tercero = segundo;
    	            segundo = primero;
    	            primero = juego;
    	        } else if (segundo == null || descargas > segundo.getNumDescargas()) {
    	            tercero = segundo;
    	            segundo = juego;
    	        } else if (tercero == null || descargas > tercero.getNumDescargas()) {
    	            tercero = juego;
    	        }
    	    }

    	    List<Juego> top3 = new ArrayList<>();
    	    if (primero != null) top3.add(primero);
    	    if (segundo != null) top3.add(segundo);
    	    if (tercero != null) top3.add(tercero);

    	    return top3;
    	}



    public List<Juego> filtrarPorPais(String pais) {
		List <Juego> filtroPorPaises = new ArrayList<Juego>();
		Set <Map.Entry<Juego, EstudioDesarrollo>> entry = juegos.entrySet();
		Iterator<Entry<Juego, EstudioDesarrollo>> it = entry.iterator();
		while (it.hasNext()) {
			Entry<Juego,EstudioDesarrollo> pareja = it.next();
			if (pareja.getValue().getPais().equals(pais)) {
				filtroPorPaises.add(pareja.getKey());
			}
        }
        return filtroPorPaises;
    }

}
