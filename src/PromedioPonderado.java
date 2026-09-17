import java.util.Scanner;


public class PromedioPonderado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, promedioPonderado;

        System.out.print("Ingrese la primera nota: ");
        do {
            nota1 = scanner.nextDouble();
            if (nota1 < 0 || nota1 > 5) {
                System.out.print("Nota inválida. Ingrese la primera nota nuevamente: ");
            }
        } while (nota1 < 0 || nota1 > 5);
        
        System.out.print("Ingrese la segunda nota: ");
        do {
            nota2 = scanner.nextDouble();
            if (nota2 < 0 || nota2 > 5) {
                System.out.print("Nota inválida. Ingrese la segunda nota nuevamente: ");
            }
        } while (nota2 < 0 || nota2 > 5);

        System.out.print("Ingrese la tercera nota: ");
        do {
            nota3 = scanner.nextDouble();
            if (nota3 < 0 || nota3 > 5) {
                System.out.print("Nota inválida. Ingrese la tercera nota nuevamente: ");
            }
        } while (nota3 < 0 || nota3 > 5);
        promedioPonderado = Math.round((nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.4) * 100.0) / 100.0;

        System.out.println("El promedio ponderado es: " + promedioPonderado);

        switch(Double.compare(promedioPonderado, 3.0)) {
            case 1:
                System.out.println("El estudiante ha aprobado.");
                break;
            case 0:
                System.out.println("El estudiante ha aprobado.");
                break;
            case -1:
                System.out.println("El estudiante ha reprobado.");
                break;
        }



    }
}
