import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] soldados = new int[6];
		int bem = 0;
		
		for (byte i = 0; i < 6; i++) {
			soldados[i] = scan.nextInt();
			bem += soldados[i];
		}
		
		int mal = soldados[3] + soldados[4];
		bem -= mal;
		
		if (bem >= mal) {
			System.out.println("Middle-earth is safe.");
		} else {
			System.out.println("Sauron has returned.");
		}
		
		scan.close();
		
	}
}
