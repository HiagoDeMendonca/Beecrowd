import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		short repeticoes = Short.parseShort(scan.nextLine());
		
		for (short i = 0; i < repeticoes; i++) {
			String input = scan.nextLine();
			if (input.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				String[] split = input.split("\\+");
				System.out.println(Short.parseShort(split[0]) + Short.parseShort(split[1]));
			}
		}
		
		scan.close();
		
	}
	
}
