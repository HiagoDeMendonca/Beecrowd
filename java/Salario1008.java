import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int id = scan.nextInt();
		int horas = scan.nextInt();
		float valorHora = scan.nextFloat();
		
		float salario = valorHora * horas;
		
		System.out.println("NUMBER = " + id);
		System.out.println("SALARY = U$ " + dfor.format(salario));
		
	}
	
}
