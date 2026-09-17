import java.util.Scanner;

public class TALLER32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secreto = (int)(Math.random() * 100) + 1;
        int numero;
        int intentos = 0;

        System.out.println("Adivina el numero (entre 1 y 100):");

        do {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();

            intentos = intentos + 1;

            if (numero > secreto) {
                System.out.println("El numero es menor");
            } else if (numero < secreto) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("Correcto! " + intentos + " intentos");
            }

        } while (numero != secreto);

        sc.close();
    }
}