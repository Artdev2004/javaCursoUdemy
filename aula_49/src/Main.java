import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		for(int i = 0; i < x; i++) {
			int num = sc.nextInt();
			soma = num + soma;
		}
		System.out.println("Soma: " + soma);
	}

}
