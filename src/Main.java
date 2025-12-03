
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Proyecto base");
		
		if (clase_SergioMolano.validarDNI("49837823C") == true) {
			System.out.println("DNI correto.");
		} else {
			System.out.println("DNI erróneo.");
		}
	}

}
