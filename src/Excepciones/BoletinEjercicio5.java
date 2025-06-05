package Excepciones;

public class BoletinEjercicio5 {

	public static void main(String[] args) {
		
		MiExcepcion m = new MiExcepcion(null);
		
		try {
			m.metodo1(1);
		}catch(MiExcepcion e) {
			System.out.println(e.getMessage());
		}
			
	}

} 
