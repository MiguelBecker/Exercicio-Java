package mcb4;
import java.util.Scanner;
public class JavaEstruturado3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma = 0;
		double multiplicacao = 1;
		double invercos = 0;
		double i = 1;
		while(i <= 5) {
			System.out.println("Digite um Numero: ");
			double a = scanner.nextFloat();
			soma = soma + a;
			multiplicacao = multiplicacao * a;
			invercos = invercos + 1 / a;
			i = i + 1;
		}
		double aritmetica = soma/i;
		double geometrica = Math.pow(multiplicacao, 1.0 / 5.0);
		double harmonica = 5 / invercos;
		System.out.println(aritmetica);
		System.out.println(geometrica);
		System.out.println(harmonica);
		scanner.close();
	}
}
