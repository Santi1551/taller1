import java.util.Scanner;


public class CalificacionLetras {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación numérica (0-5.0): ");
        double calificacion = sc.nextDouble();
        char letra;

        if (calificacion > 4.5) {
            letra = 'A';
        } else if (calificacion >= 4.0) {
            letra = 'B';
        } else if (calificacion >= 3.5) {
            letra = 'C';
        } else if (calificacion >= 3.0) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        System.out.println("La calificación en letras es: " + letra);
    }
}
