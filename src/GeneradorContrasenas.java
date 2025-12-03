import java.security.SecureRandom;
import java.util.Scanner;

public class GeneradorContrasenas {

    // Conjuntos de caracteres
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{};:,.<>?/";

    public static String generarContrasena(int longitud, boolean usarMayus, boolean usarMinus,
                                           boolean usarNums, boolean usarSimb) {

        StringBuilder conjunto = new StringBuilder();
        
        if (usarMayus) conjunto.append(MAYUSCULAS);
        if (usarMinus) conjunto.append(MINUSCULAS);
        if (usarNums) conjunto.append(NUMEROS);
        if (usarSimb) conjunto.append(SIMBOLOS);

        if (conjunto.length() == 0) {
            throw new IllegalArgumentException("Debe seleccionar al menos un tipo de caracter.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(conjunto.length());
            contrasena.append(conjunto.charAt(index));
        }

        return contrasena.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Longitud de la contraseña: ");
        int longitud = scanner.nextInt();

        System.out.print("Incluir mayúsculas? (s/n): ");
        boolean mayus = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir minúsculas? (s/n): ");
        boolean minus = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir números? (s/n): ");
        boolean nums = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir símbolos? (s/n): ");
        boolean simb = scanner.next().equalsIgnoreCase("s");

        String password = generarContrasena(longitud, mayus, minus, nums, simb);

        System.out.println("\nContraseña generada: " + password);
    }
}
