package primera_aplicacion;

public class Aplicacion {
	
	//Atributos de clase están disponibles desde
	//que se crea la clase hasta que acaba el
	//programa (más o menos).
	private int a=3;
	private int b=4;
	
	public int sumar() {
		int c=a+b;
		return c;
		//System.out.println(c);
	}
	
	public float sumarFlotante() {
		//f es una variable de método, por lo que
		//no puedes acceder a ella desde fuera de él.
		float f=a+b;
		return f;
	}
	
	public void restar() {
		//No puedo acceder a f desde aquí.
		//System.out.println(f);
		System.out.println();
		System.out.println(a-b);
	}
	
	public Aplicacion ejemploTonto() {
		System.out.println("Se crea un objeto de la clase Aplicacion.");
		Aplicacion otraApp=new Aplicacion();
		return otraApp;
	}
	
	public static void main(String[] args) {
		Aplicacion primera=new Aplicacion();
	//	int d=primera.sumar(); //d=7
	//	int e=primera.sumar();
	//	System.out.println(d+e);
		
	//	float g=primera.sumarFlotante();
	//	System.out.println(g);
		
		primera.ejemploTonto();
		primera.ejemploTonto();
	//  otraApp solo existe dentro de ejemploTonto();	
	//  otraApp.sumar();
	//	primera.restar();
	}

}
