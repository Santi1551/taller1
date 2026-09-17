import java.util.Scanner;

public class TALLER13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, altura, radio;
        double areaRectangulo, perimetroRectangulo;
        double areaCirculo, circunferencia;

        System.out.print("Digite la base del rectangulo: ");
        base = sc.nextDouble();

        System.out.print("Digite la altura del rectangulo: ");
        altura = sc.nextDouble();

        System.out.print("Digite el radio del circulo: ");
        radio = sc.nextDouble();

        areaRectangulo = base * altura;
        perimetroRectangulo = 2 * (base + altura);

        areaCirculo = Math.PI * radio * radio;
        circunferencia = 2 * Math.PI * radio;

        System.out.println("Area del rectangulo: " + areaRectangulo);
        System.out.println("Perimetro del rectangulo: " + perimetroRectangulo);
        System.out.println("Area del circulo: " + areaCirculo);
        System.out.println("Circunferencia: " + circunferencia);

        sc.close();
    }
}