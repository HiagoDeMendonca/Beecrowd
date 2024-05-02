import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	static String checkNumber(int number) {
		
		String evenOdd, posNeg, strFinal;
		
		if (number == 0) {strFinal = "NULL";}
		else {
			evenOdd = (number % 2 == 0) ? "EVEN" : "ODD";
			posNeg = (number > 0) ? "POSITIVE" : "NEGATIVE";
			strFinal = (evenOdd + " " + posNeg);
		}
		
		return strFinal;
		
	}
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		
		for (int i = 0; i < input; i++) {
			int item = scan.nextInt();
			String output = checkNumber(item);
			System.out.println(output);
		}
		
		scan.close();
		
	}
}
