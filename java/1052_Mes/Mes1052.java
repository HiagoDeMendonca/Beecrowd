import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		String mesNome = "mesGenerico";
		
		switch (input) {
			case 1:
				mesNome = "January";
				break;
			case 2:
				mesNome = "February";
				break;
			case 3:
				mesNome = "March";
				break;
			case 4:
				mesNome = "April";
				break;
			case 5:
				mesNome = "May";
				break;
			case 6:
				mesNome = "June";
				break;
			case 7:
				mesNome = "July";
				break;
			case 8:
				mesNome = "August";
				break;
			case 9:
				mesNome = "September";
				break;
			case 10:
				mesNome = "October";
				break;
			case 11:
				mesNome = "November";
				break;
			case 12:
				mesNome = "December";
				break;
		}
		
		System.out.println(mesNome);
		
		scan.close();
		
	}
}
