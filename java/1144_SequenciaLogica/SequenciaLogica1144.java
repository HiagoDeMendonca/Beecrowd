import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		
		int item1, item2, item3;
		item1 = item2 = item3 = 1;
		
		int fatorDois = 2;
		int fatorTres = 1;
		int fatorTres2 = 2;
		
		for (int i = 0; i < input * 2; i++) {
			System.out.println(item1 + " " + item2 + " " + item3);
			if (i % 2 == 0) {
				item2++;
				item3++;
			} else {
				item1++;
				item2 += fatorDois;
				fatorDois += 2;
				item3 += 6 * fatorTres;
				fatorTres += fatorTres2;
				fatorTres2++;
			}
		}
		
		scan.close();
		
	}
}
