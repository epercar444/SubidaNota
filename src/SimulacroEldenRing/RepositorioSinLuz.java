package SimulacroEldenRing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RepositorioSinLuz {
	Set <Sinluz> sinluz;
	
	
	public RepositorioSinLuz() {
		super();
		this.sinluz = new TreeSet<Sinluz>();
	}

	public Sinluz getSinLuz(int id) throws EldenExcepcion {
	    Iterator<Sinluz> it = sinluz.iterator();
	    Sinluz encontrado = null;

	    while (it.hasNext()) {
	        Sinluz f = it.next();
	        if (f.getId() == id) {
	            System.out.println(f.toString());
	            encontrado = f;
	        }
	    }

	    if (encontrado == null) {
	        throw new EldenExcepcion("No existe el SinLuz con el id: " + id);
	    }

	    return encontrado;
	}


	
	public void agregaEncuentro(Encuentro e, int i) throws EldenExcepcion {
	    Iterator<Sinluz> it = sinluz.iterator();
	    boolean encontrado = false;

	    while (it.hasNext()) {
	        Sinluz f = it.next();
	        if (f.getId() == i) {
	            f.getEncuentros().add(e);
	            System.out.println("Encuentro añadido correctamente");
	            encontrado = true;
	        }
	    }

	    if (!encontrado) {
	        throw new EldenExcepcion("No existe el SinLuz con el id: " + i);
	    }
	}

	public List<Encuentro> getEncuentroMayorDificultad (Sinluz f) {
		List<Encuentro> encuentros = new ArrayList<Encuentro>();
		for (Encuentro t : f.getEncuentros()) {
			if (t.getDificultad() > 6) {
				encuentros.add(t);
			}
		}
		return encuentros;
	}
}

