import java.util.Scanner;

public class Main {
    
    static Scanner scan = new Scanner(System.in);
 
    static void processarNumeros(int entrada1, int entrada2) {
        
        int maior = Math.max(entrada1, entrada2);
        int menor = Math.min(entrada1, entrada2);
        
        int soma = 0;
        
        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
            soma += i;
        }
        
        System.out.println("Sum=" + soma);
        
    }
 
    public static void main(String[] args) {
        
        int entrada1 = 99;
        int entrada2 = 99;
        
        while (entrada1 > 0 && entrada2 > 0) {
            
            entrada1 = scan.nextInt();
            entrada2 = scan.nextInt();
            
            if (entrada1 > 0 && entrada2 > 0) {
                processarNumeros(entrada1, entrada2);
            }
        }
        
        scan.close();
    }
}
