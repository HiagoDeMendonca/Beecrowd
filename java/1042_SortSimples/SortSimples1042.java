import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int itens = 3;
		
		int[] arrayLista = new int[itens];
		int[] arraySorted = new int[itens];
		
		for (int i = 0; i < itens; i++)
		{
			arrayLista[i] = scan.nextInt();
		}
		
		System.arraycopy(arrayLista, 0, arraySorted, 0, itens);
		Arrays.sort(arraySorted);
		
		for (int i = 0; i < itens; i++)
		{
			System.out.println(arraySorted[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < itens; i++)
		{
			System.out.println(arrayLista[i]);
		}
		
		scan.close();
		
	}
}
