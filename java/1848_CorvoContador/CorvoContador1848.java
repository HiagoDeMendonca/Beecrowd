import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for (int z = 0; z < 3; z++) {
			
			String input = scan.nextLine();
			
			int resultado = 0;
			
			while (!input.equals("caw caw")) {
				
				input = input.replace('-', '0');
				input = input.replace('*', '1');
				
				input = "0" + input;
				
				resultado += Integer.parseInt(input,2);
				
				input = scan.nextLine();
				
			}
			
			System.out.println(resultado);
			
		}
		
		scan.close();
		
	}
}
