public class Main {
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 7;
		
		for (int y = 0; i <= 9; y++) {
			
			System.out.println("I=" + i + " J=" + (j - y));
			
			if (y == 2) {
				y = -1;
				i += 2;
			}
			
		}
		
	}
}
