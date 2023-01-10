import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Locale.setDefault(Locale.US);

		double x, y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("EIXO X: ");
		x = sc.nextDouble();
		System.out.println("EIXO Y: ");
		y = sc.nextDouble(); 
		
		if (x > 0 ) {
			if (y < 0 ) {// x positivo e y negativo q4
				System.out.println("Q4");
			}
			else {//x + e y +  = q1
				System.out.println("Q1");
			}
		}
		else if (x < 0 ) {
			if(y > 0) {
				System.out.println("Q2");
			}
			else {
				System.out.println("Q3");
			}
		}
		
		sc.close();
		
		
		

	}

}
