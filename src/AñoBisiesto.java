import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = sc.nextInt();

        boolean bisiesto = (año % 4 == 0) &&
                           (año % 100 != 0 || año % 400 == 0);

        if (bisiesto) {
            System.out.println(año + " es bisiesto");
        } else {
            System.out.println(año + " no es bisiesto");
        }

       
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        String nombreDia = "";

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;

            case 2:
                nombreDia = "Martes";
                break;

            case 3:
                nombreDia = "Miércoles";
                break;

            case 4:
                nombreDia = "Jueves";
                break;

            case 5:
                nombreDia = "Viernes";
                break;

            case 6:
                nombreDia = "Sábado";
                break;

            case 7:
                nombreDia = "Domingo";
                break;

            default:
                System.out.println("Número fuera de rango");
        }

        if (!nombreDia.isEmpty()) {
            System.out.println("Día: " + nombreDia);
        }

        sc.close();
    }
}