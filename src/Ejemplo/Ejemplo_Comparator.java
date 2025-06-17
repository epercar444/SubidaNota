package Ejemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejemplo_Comparator {

	public static void main(String[] args) {
		Set<Persona> persona = new TreeSet<Persona>();
		Persona p1 = new Persona("Ana", "García", "12345678A", 25);
		Persona p2 = new Persona("Luis", "Martínez", "87654321B", 32);
		Persona p3 = new Persona("Clara", "López", "45678912C", 19);
		Persona p4 = new Persona("Javier", "Sánchez", "11223344D", 40);
		Persona p5 = new Persona("Marta", "Ruiz", "99887766E", 28);
		persona.add(p1);
		persona.add(p2);
		persona.add(p3);
		persona.add(p4);
		persona.add(p5);
		System.out.println(persona.toString());
		
		ComparadorPorNombre r = new ComparadorPorNombre();
		List<Persona> lista = new ArrayList<Persona>(persona);
		Collections.sort(lista,r);
		System.out.println(lista.toString());
	}
	Set<Persona> persona;
	public Ejemplo_Comparator(Set<Persona> persona) {
		super();
		this.persona = new TreeSet<Persona>();
	}
	
	
}
