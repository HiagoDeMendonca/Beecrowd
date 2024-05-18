import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int caso = 0;
		
		while (caso != 5) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if (x > 0 && y > 0) {caso = 1;}
			else if (x < 0 && y > 0) {caso = 2;}
			else if (x < 0 && y < 0) {caso = 3;}
			else if (x > 0 && y < 0) {caso = 4;}
			else caso = 5;
			
			if (caso != 5)
			{
				switch (caso)
				{
					case 1:
						System.out.println("primeiro");
						break;
					case 2:
						System.out.println("segundo");
						break;
					case 3:
						System.out.println("terceiro");
						break;
					case 4:
						System.out.println("quarto");
						break;
				}
			}
		}
		
		scan.close();
		
	}
}
