package alb_TA08_01;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona("Juan", 30, "H");
		Persona p3 = new Persona("Sandra", 30, "12345678E", "M", 45, 34);
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		System.out.println(p1.getDni());
		System.out.println(p1.getSexo());
		System.out.println(p1.getPeso());
		System.out.println(p1.getAltura());
		
		System.out.println();
		
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		System.out.println(p2.getDni());
		System.out.println(p2.getSexo());
		System.out.println(p2.getPeso());
		System.out.println(p2.getAltura());
		
		System.out.println();
		
		System.out.println(p3.getNombre());
		System.out.println(p3.getEdad());
		System.out.println(p3.getDni());
		System.out.println(p3.getSexo());
		System.out.println(p3.getPeso());
		System.out.println(p3.getAltura());
	}

}
