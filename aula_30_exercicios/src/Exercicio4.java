import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		int num, hrs;
		float sal, qthr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NÚMERO:\n ");
		num = sc.nextInt();
		System.out.println("DIGITE SUAS HORAS TRABALHADAS:\n ");
		hrs = sc.nextInt();
		System.out.println("DIGITE QUANTO GANHA POR HORA:\n ");
		qthr = sc.nextFloat();
		
		sal = hrs * qthr;
		
		System.out.println("NÚMERO: " + num);
		System.out.println("HORAS TRABALHADAS: " + hrs);
		System.out.printf("SALÁRIO: U$%.2f", sal);
		
		
		
	}
	

}
