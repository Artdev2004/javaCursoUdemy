import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são? ");
		x = sc.nextInt();
		
		if(x <= 12) {
			
			System.out.println("Bom dia");
		}
		else if(x <= 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
			
		
		
	    //chaining 
		//control structure
		sc.close();
		
	}

}
