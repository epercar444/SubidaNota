package NttExamen;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

public class RepositorioEnvios {
	private Map<Envio, HashSet<CentroDistribucion>> envios;
	public RepositorioEnvios() {
		super();
		// TODO Auto-generated constructor stub
		this.envios = new HashMap<Envio, HashSet<CentroDistribucion>>();
	}

	// TODO: agregarCentroDistribucion
	public void agregarCentroDistribucion(String numSeguimiento, LocalDate fecha, CentroDistribucion centro) throws EnvioException {
		Envio e = this.buscarEnvio(fecha, numSeguimiento);
		if (e.equals(null)) {
			e = new Envio (fecha,numSeguimiento,0,null);
			this.envios.put(e, new HashSet<CentroDistribucion>());
		}
		this.envios.get(e).add(centro);
	}

	// TODO: buscarEnvio
	public Envio buscarEnvio(LocalDate fechaEnvio, String numeroSeguimiento) throws EnvioException {
		Envio e = new Envio (fechaEnvio,numeroSeguimiento,0,null);
		Envio envioFinal = null;
		if(this.envios.containsKey(e)) {
			envioFinal = e;
		}
		else {
			throw new EnvioException("El envio no está");
		}
		return envioFinal;
	}

	// TODO: filtrarEnviosPorCentro
	public List<Envio> filtrarEnviosPorCentro(String codigoCentro) {
		List<Envio> envio = new ArrayList<Envio>();
		Set<Map.Entry <Envio, HashSet<CentroDistribucion>>> entradas = envios.entrySet();
		Entry<Envio, HashSet<CentroDistribucion>> elemento;
		Iterator it = entradas.iterator();
		while (it.hasNext()) {
			elemento = (Entry<Envio, HashSet<CentroDistribucion>>) it.next();
			if (elemento.getValue() >= 5) {
				alumnos.add(elemento.getKey());
			}
		}
		return new ArrayList<>();
	}

	// TODO: buscarCentroDistribucion
	public boolean buscarCentroDistribucion(LocalDate fechaEnvio, String numeroSeguimiento, String codigoCentro) {
		// TODO: completar este método
		return false;
	}

	// TODO: isCentroFinal
	public boolean isCentroFinal(LocalDate fechaEnvio, String numeroSeguimiento, String codigoCentro) {
		// TODO: completar este método
		return false;
	}
}
