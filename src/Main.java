import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite tr�s n�meros:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a > b && a > c) {
				System.out.println("O maior = " + a);
			} else if (b > c) {
				System.out.println("O maior = " + b);
			} else {
				System.out.println("O maior = " + c);
			}
			sc.close();
	}
}

