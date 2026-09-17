import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int secreto = (int)(Math.random() * 100) + 1;
        int intentos = 0;
        int numero;

        
        do {
            System.out.print("Ingresa tu número: ");
            numero = scanner.nextInt();
            intentos++;

            if (numero > secreto) {
                System.out.println("El número es menor");
            } else if (numero < secreto) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("¡Correcto! " + intentos + " intentos");
            }

        } while (numero != secreto);

        scanner.close();
    }
}