package mcb4;
import java.util.Scanner;

public class JavaEstruturado1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fatorial = 1;
		System.out.println("Digite um Numero Inteiro: ");
		int n = scanner.nextInt();
		
		if (n < 0) {
			System.out.println("MENOR QUE ZERO");
		}
		else if(n > 16) {
			
			System.out.println("OVERFLOW");
		}
		else {
			for(int i = 1; i <= n; i++) {
				fatorial = fatorial * i;
			}
			System.out.println(fatorial);
		}
		scanner.close();
	}
}
