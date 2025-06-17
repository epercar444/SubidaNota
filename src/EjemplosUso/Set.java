package EjemplosUso;

import java.util.HashSet;

public class Set {
public static void main(String[] args) {
	HashSet<String> contactos = new HashSet<String>();
	contactos.add("Hola");
	contactos.add("Adiós");
	contactos.add("Buenas");
	for (String e : contactos) {
		System.out.println(e);
	}
}
}
