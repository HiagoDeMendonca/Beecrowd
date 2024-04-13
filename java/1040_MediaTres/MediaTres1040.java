import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");
	
	public static void main(String[] args) {
		
		float notaA = scan.nextFloat();
		float notaB = scan.nextFloat();
		float notaC = scan.nextFloat();
		float notaD = scan.nextFloat();
		
		float media = (notaA * 2 + notaB * 3 + notaC * 4 + notaD) / 10;
        
		System.out.println("Media: " + dfor.format(media));
		
		if (media >= 7) {System.out.println("Aluno aprovado.");}
		else if (media < 5) {System.out.println("Aluno reprovado.");}
		else
		{
		System.out.println("Aluno em exame.");
		float notaExame = scan.nextFloat();
		System.out.println("Nota do exame: " + notaExame);
		float finalMedia = (notaExame + media) / 2;
		
		if (finalMedia >= 5) {System.out.println("Aluno aprovado.");}
		else {System.out.println("Aluno reprovado.");};
		
		System.out.println("Media final: " + finalMedia);
		}
		
		scan.close();
		
	}
	
}
