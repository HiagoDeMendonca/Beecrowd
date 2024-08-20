import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] musicas = {"PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};
		
		int repeticoes = scan.nextInt();
		
		for (int i= 0; i < repeticoes; i++) {
			byte input1 = scan.nextByte();
			byte input2 = scan.nextByte();
			
			System.out.println(musicas[input1 + input2]);
		}
		
		scan.close();
		
	}
}
