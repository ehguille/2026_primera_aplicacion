package primera_aplicacion;

public class Aplicacion {
	
	private int a=3;
	private int b=4;
	
	public void sumar() {
		System.out.println(a+b);
	}
	
	public void restar() {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		Aplicacion primera=new Aplicacion();
		primera.sumar();
		primera.restar();
	}

}
