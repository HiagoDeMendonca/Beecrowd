import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		byte repeticoes = Byte.parseByte(scan.next());
		
		for (byte y = 0; y < repeticoes; y++) {
			
			String input1 = scan.next();
			String input2 = scan.next();
			
			long resultado = 0;
			
			for (int i = 0; i < input1.length(); i++) {
				
				if (input2.charAt(i) - input1.charAt(i) < 0) {
					resultado += input2.charAt(i) - input1.charAt(i) + 26;
				} else {
					resultado += input2.charAt(i) - input1.charAt(i);
				}
				
			}
			
			System.out.println(resultado);
			
		}
		
		scan.close();
		
	}
}
