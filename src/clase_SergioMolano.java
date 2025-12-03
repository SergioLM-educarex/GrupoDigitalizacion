
public class clase_SergioMolano {
	
	public static boolean validarDNI(String dni) {
	    // Formato básico: 8 dígitos + 1 letra
	    if (dni == null || !dni.matches("\\d{8}[A-Za-z]")) {
	        return false;
	    }

	    // Calcular letra válida
	    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	    int numero = Integer.parseInt(dni.substring(0, 8));
	    char letraCalculada = letras.charAt(numero % 23);

	    // Comparar letra
	    return Character.toUpperCase(dni.charAt(8)) == letraCalculada;
	}

}
