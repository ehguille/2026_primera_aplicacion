package primera_aplicacion;

public class Cocinero {
	
	private String nombre="José"; //nombre=Manuela
	private int edad=23;
	
	public Cocinero(String nombreCocinero, int edadCocinero) {
		System.out.println("Se acaba de crear un cocinero");
		nombre=nombreCocinero;
		edad=edadCocinero;
	}
	
	public int hacerMasa(int grHarina, int grAgua, int grAceite) {
		System.out.println(nombre+" hace una masa");
		int grMasa=grHarina+grAgua+grAceite;
		return grMasa;
	}
	
	public String consultarNombre() {
		return nombre;
	}
	
	public int consultarEdad() {
		return edad;
	}
	
	public void establecerNombre(String nuevoNombre) {
		nombre=nuevoNombre;
	}

}
