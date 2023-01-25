import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//debug execução passo a passo 
		// marcar linha de breakpoint - ele executa passo a passo, 
		// a partir de um ponto do seu interesse
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double wth = sc.nextDouble();
		double lth = sc.nextDouble();
		double met2 = sc.nextDouble();
		
		double area = wth * lth;
		double prc = area * met2;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", prc);
		
		sc.close();
	}

}
