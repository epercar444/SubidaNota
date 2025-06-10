package Mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemploMapas {

	public static void main(String[] args) {
		EjemploMapas f = new EjemploMapas();
		Map<String, Double> notasAlumnado = new HashMap<>();
		notasAlumnado.put("Rosa", 3.9);
		notasAlumnado.put("Lourdes", 9.0);
		notasAlumnado.put("Rosa", 5.0);
		notasAlumnado.put("Eva", 5.5);
		notasAlumnado.put("Pepe", 2.3);
		System.out.println(f.getAprobados(notasAlumnado));
		System.out.println(f.getNombre(" ", notasAlumnado));

	}
	List<String> getAprobados(Map<String,Double> mapa) { 
		List<String> alumnos = new ArrayList<String>();
		Set<Map.Entry <String, Double>> entradas = mapa.entrySet();
		Entry <String, Double> elemento;
		Iterator it = entradas.iterator();
		while (it.hasNext()) {
			elemento = (Entry<String, Double>) it.next();
			if (elemento.getValue() >= 5) {
				alumnos.add(elemento.getKey());
			}
		}
		return alumnos;
	}
	Double getNombre (String nombre,Map<String,Double> mapa) {
		Double nota = 0.0;
		Set<Map.Entry <String, Double>> entradas = mapa.entrySet();
		Entry <String, Double> elemento;
		Iterator it = entradas.iterator();
		while (it.hasNext()) {
			elemento = (Entry<String, Double>) it.next();
			if (elemento.getKey().equals(nombre)) {
				nota = elemento.getValue();
			}
		}
		return nota;
	}
}
