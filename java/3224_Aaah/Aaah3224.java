import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		short marius = (short)scan.next().length();
		short medico = (short)scan.next().length();
		
		String output = (marius >= medico) ? "go" : "no";
		
		System.out.println(output);
		
		scan.close();
		
	}
}
