import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double rad, pi = 3.1415, area = 0.0000;
		
		System.out.println("Digite o valor do raio do círculo: ");
		rad = sc.nextDouble(); 	
		
		area = pi * Math.pow(rad, 2);
		System.out.printf("A area do circulo: %.4f%n", area);
		
		sc.close();
		

	}

}
