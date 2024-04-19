import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String condicao1, condicao2, condicao3, animal;
		condicao1 = scan.next();
		condicao2 = scan.next();
		condicao3 = scan.next();
		
		animal = "animalGenerico";
		
		if (condicao1.equals("vertebrado")) {
			if (condicao2.equals("ave")) {
				if (condicao3.equals("carnivoro")) {
					animal = "aguia";
				} else {
					animal = "pomba";
				}
			} else {
				if (condicao3.equals("onivoro")) {
					animal = "homem";
				} else {
					animal = "vaca";
				}
			}
		} else if (condicao1.equals("invertebrado")) {
			if (condicao2.equals("inseto")) {
				if (condicao3.equals("hematofago")) {
					animal = "pulga";
				} else {
					animal = "lagarta";
				}
			} else {
				if (condicao3.equals("hematofago")) {
					animal = "sanguessuga";
				} else {
					animal = "minhoca";
				}
			}
		}
		
		System.out.println(animal);

		scan.close();
		
	}
}
