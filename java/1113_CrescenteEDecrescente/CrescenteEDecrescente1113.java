import java.util.Scanner;

public class Main {
   
    static Scanner scan = new Scanner(System.in);
 
    static void processarNumeros(int entrada1, int entrada2) {
       
       if (entrada1 > entrada2) {
           System.out.println("Decrescente");
       } else if (entrada1 < entrada2) {
           System.out.println("Crescente");
       }
       
    }
 
    public static void main(String[] args) {
       
        int entrada1, entrada2;
       
        do {
            entrada1 = scan.nextInt();
            entrada2 = scan.nextInt();
           
            processarNumeros(entrada1, entrada2);
           
        } while (entrada1 != entrada2);
       
        scan.close();
    }
}

