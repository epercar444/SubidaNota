package Boletin3Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
	List<Grupo> grupos;

	public Instituto(List<Grupo> grupos) {
		super();
		this.grupos = new ArrayList<Grupo>();
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Instituto [grupos=" + grupos + "]";
	}
	
	public void añadeGrupo(Grupo nuevoGrupo) {
		grupos.add(nuevoGrupo);
	}
	
	
	public void añadeEstudiante (Grupo grupoAlQueAñadir, Estudiante nuevoEstudiante) {
		for (Grupo g : grupos) {
			if (g.equals(grupoAlQueAñadir)) {
				List<Estudiante> estudiantes = g.getEstudiantes();
				estudiantes.add(nuevoEstudiante);
			}
		}
	}
	
	public void listarEstudiantes (Grupo grupoEnElBuscar) {
		for (Grupo g : grupos) {
			if (g.equals(grupoEnElBuscar)) {
				List<Estudiante> estudiantes = g.getEstudiantes();
				for (Estudiante p : estudiantes) {
					System.out.println("Las notas del estudiante" + p.getNombre() + "son: " + p.getNotas());
				}
			}
		}
	}
	
	public void GrupotoString (Grupo GrupoABuscar) {
		for (Grupo g : grupos) {
			if (g.equals(GrupoABuscar)) {
				System.out.println(g.toString());
			}
		}
	}
	
	public void promedioEstudiante (int idEstudiante) throws ExcepcionColecciones {
		int promedio = 0;
		for (Grupo g : grupos) {
			for (Estudiante w : g.getEstudiantes()) {
				int idReal = w.getId();
				if (idReal == idEstudiante) {
					for (Integer r : w.getNotas()) {
						promedio = promedio + r;
					}
				}
				else {
					throw new ExcepcionColecciones ("El id no está en la lista");
				}
			}
		}
		
	}
	
	public void promedioGrupo (String descripcion) throws ExcepcionColecciones {
		int promedio = 0;
		for (Grupo g : grupos) {
			if (g.getDescripcion().contains(descripcion)) {
					for (Estudiante r : g.getEstudiantes()) {
						for (Integer f:r.getNotas()) {
							promedio = promedio + f;
					}
				}
			}
				else {
					throw new ExcepcionColecciones ("La descripción no está en la lista");
				}
			}
		}
	public void salirPrograma () {
		System.out.println("Saliendo del programa");
	}
}

