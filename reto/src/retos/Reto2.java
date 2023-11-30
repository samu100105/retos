package retos;
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
            	System.out.print("¡Error, no es positivo.");
            }
      
        } while (numero <= 0);

        for (int i = numero + 1; i <= numero + 20; i++) {
            System.out.println(i);
        }
   scanner.close();
    }
}
