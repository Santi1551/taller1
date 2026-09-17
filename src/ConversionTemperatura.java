import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingresa la temperatura en celsius: ");
        double celsius = sc.nextDouble();

       
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

       
        System.out.printf("Celsius: %.2f%n", celsius);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Kelvin: %.2f%n", kelvin);

        sc.close();
    }
}
