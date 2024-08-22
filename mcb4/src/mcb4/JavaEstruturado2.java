package mcb4;
import java.util.Scanner;
public class JavaEstruturado2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float soma = 0;
		while(true) {
			System.out.println("Digite um Numero: ");
			float a = scanner.nextFloat();
			if (a >= 5.0 && a <= 5000.0) {
				soma = soma + a;
			}
			else if(a < 0.0) {
				break;
			}
		}
		System.out.println(soma);
		scanner.close();
	}
}
