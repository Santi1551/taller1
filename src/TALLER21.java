import java.util.Scanner;

public class TALLER21{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite el lado a: ");
        a = sc.nextDouble();

        System.out.print("Digite el lado b: ");
        b = sc.nextDouble();

        System.out.print("Digite el lado c: ");
        c = sc.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {

            System.out.println("No es un triangulo valido");

        } else {

            if (a == b && b == c) {

                System.out.println("Equilatero");

            } else if (a == b || b == c || a == c) {

                System.out.println("Isosceles");

            } else {

                System.out.println("Escaleno");
            }
        }

        sc.close();
    }
}