package retos;
public class Reto3 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de números múltiplos de 2 o 3: " + contador);
    }
}
