import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qte1, qte2;
		double vu1, vu2, total;
		
		cod1 = sc.nextInt();
		qte1 = sc.nextInt();
		vu1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		vu2 = sc.nextDouble();
		
		total = vu1 * qte1 + vu2 * qte2;
		
		System.out.printf("VALOR A PAGAR: %.2f%n", total);

		sc.close();
	}
}