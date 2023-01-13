import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int min;
		double cont = 50.0;

		System.out.println("DIGITE OS MINUTOS: ");
		min = sc.nextInt();

		if (min > 100) {
			cont += (min - 100) * 2.0; // operador de atribuicao cumulativa += *= %= /=
		}
		System.out.printf("Valor da conta = R$ %.2f", cont);
		sc.close();
	}

}
