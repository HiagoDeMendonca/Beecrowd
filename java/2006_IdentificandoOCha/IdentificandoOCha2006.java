import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte cha = scan.nextByte();
		
		byte contagem = 0;
		
		for (byte i = 0; i < 5; i++) {
			
			byte palpite = scan.nextByte();
			if (palpite == cha) {contagem++;}
			
		}
		
		System.out.println(contagem);
		
		scan.close();
		
	}
}
