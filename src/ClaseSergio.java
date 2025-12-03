import java.util.Scanner;

public class ClaseSergio {
	public static void calculoFactorial() {
		Scanner entrada = new Scanner(System.in);
		
		
		int num=0; 
		int factorial = 0;
		
		System.out.println("Inserte el numero del que quiere hacer el factorial");
		num=Integer.parseInt(entrada.nextLine());
		
		for (int i = 0; i <= num; i++) {
			 
			    if (num == 0 || num == 1) {
			       factorial = 1;
			    }
			    factorial = 1;
			    for (i = 2; i <= num; i++) {
			        factorial *= i;
			    }
			    
			    System.out.println("El numero factorial de "+num+" es "+factorial);
		}
		
	}
}
