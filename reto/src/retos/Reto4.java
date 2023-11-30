package retos;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        // Solicitar al usuario 3 números
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Solicitar al usuario el orden de ordenamiento
        System.out.print("Selecciona el orden (ascendente/descendente): ");
        String orden = scanner.next();

        // Ordenar y mostrar los números según la preferencia del usuario
        if (orden.equalsIgnoreCase("ascendente")) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        } else if (orden.equalsIgnoreCase("descendente")) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2 - i; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados (" + orden + "): ");
        for (int num : numeros) {
            System.out.println(num);
        }
   scanner.close();
    }
}
