package agenda_Contactoordenaciones;

import java.util.HashSet;
import java.util.Set;

public class GestionaAgenda {

	public static void main(String[] args) {
		
		Set<Contacto> contactos = new HashSet<Contacto>();
		Agenda agenda = new Agenda(contactos);

		Contacto contacto1 = new Contacto("Carlos", "Rodríguez", "correoelectronico@gmail.com", 
				"Calle aguila", 634532415);
		Contacto contacto2 = new Contacto("Carlos", "Rodríguez", "correoelectronico@gmail.com", 
				"Calle aguila", 634532415);
		Contacto contacto3 = new Contacto("Manuel", "Martinez", "correoelectronic@outlook.com", 
				"Calle Cervantes", 638685635);
		
		// AGREGAR CONTACTO
		agenda.agregarContacto(contacto3);
		agenda.agregarContacto(contacto2);
		agenda.agregarContacto(contacto1);
		System.out.println(agenda);
		
		// ELIMINAR CONTACTO
		agenda.elimiarContacto(contacto2);
		
		// BUSCAR CONTACTO
		agenda.buscarContacto("Manuel", "Martinez");
		
		// MOSTRAR CONTACTOS
		//System.out.println(agenda.mostrarContactos());
		
	}
}