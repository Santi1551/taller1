import java.util.Scanner;

public class SumaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los numeros que vas a sumar: ");
        int n = sc.nextInt();

        int sumaNaturales = 0;
        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;
        }
        int formulaNaturales = n * (n + 1) / 2;

      
        int sumaPares = 0;
        for (int i = 1; i <= n; i++) {
            sumaPares += (2 * i);
        }
        int formulaPares = n * (n + 1);

        int sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += (i * i);
        }
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Serie 1 (Naturales): Bucle = " + sumaNaturales + " | Fórmula = " + formulaNaturales);
        System.out.println("Serie 2 (Pares):     Bucle = " + sumaPares + " | Fórmula = " + formulaPares);
        System.out.println("Serie 3 (Cuadrados): Bucle = " + sumaCuadrados + " | Fórmula = " + formulaCuadrados);

        sc.close();
    }
}