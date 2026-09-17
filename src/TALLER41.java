import java.util.Scanner;

public class TALLER41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0;
        double masalta = notas[0];
        int posalta = 0;
        double masbaja = notas[0];
        int posbaja = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < 10; i++) {

            suma = suma + notas[i];

            if (notas[i] > masalta) {
                masalta = notas[i];
                posalta = i;
            }

            if (notas[i] < masbaja) {
                masbaja = notas[i];
                posbaja = i;
            }

            if (notas[i] >= 3.0) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }
        }

        double promedio = suma / 10;

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mas alta: " + masalta + " - Posicion: " + posalta);
        System.out.println("Nota mas baja: " + masbaja + " - Posicion: " + posbaja);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}