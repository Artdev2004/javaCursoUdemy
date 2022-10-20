import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double tria, circ, trap, squa, rect, pi = 3.14159;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		tria = a * c /2;
		circ = pi * Math.pow(c, 2);
		trap = (a + b) * c /2;
		squa = b * b;
		rect = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", tria);
		System.out.printf("CIRCULO: %.3f\n", circ);
		System.out.printf("TRAPEZIO: %.3f\n", trap);
		System.out.printf("QUADRADO: %.3f\n", squa);
		System.out.printf("RETANGULO: %.3f\n", rect);
	}
	

}
