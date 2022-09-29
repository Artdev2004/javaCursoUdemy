import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, sum;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		System.out.println("Digite outro número: ");
		y = sc.nextInt();
		
		sum = x + y;
		
		System.out.println("A soma é = " + sum);

	}

}
