import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
<<<<<<< HEAD
		while(x != 0 && y != 0) {
			if (x < 0) {
				if (y < 0 ) {
					System.out.println("Terceiro");
				}
				else {
					System.out.println("Segundo");
				}
			}
			else {
				if(y > 0) {
					System.out.println("Primeiro");
				}
				else {
					System.out.println("Quarto");
				}
			}
			x = sc.nextInt();
			y = sc.nextInt();
=======
		while(x != 0) {
			if(x > 0 ) {			
				if(y > 0) {
					System.out.println("Primeiro");
				}	
				else{
					System.out.println("Quarto");
				}
				
			}
			else if(x < 0) {
				if (y < 0) {
					System.out.println("Terceiro");
				}
				else {
					System.out.println("Segundo");
				}
			}
			 x = sc.nextInt();
			 y = sc.nextInt();
>>>>>>> 036bb336ead9c2966c29b35a2d61663bf84af86e
			
			
		}

	}

}
