import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Fecha (dd/MM/yyyy): ");
        String fecha = sc.nextLine();
        
        System.out.println("Resultado: " + ConversionFecha.convertirFecha(fecha));
        
        sc.close();
    }
}
