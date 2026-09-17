import java.util.Scanner;

public class TALLER24{

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int tipo, horas;
        double total = 0;

        System.out.print("Digite el tipo de vehiculo (1=Moto, 2=Carro, 3=Camioneta): ");
        tipo = sc.nextInt();

        System.out.print("Digite el numero de horas: ");
        horas = sc.nextInt();

        switch (tipo) {

            case 1:
                if (horas == 1) {
                    total = 2000;
                } else {
                    total = 2000 + (horas - 1) * 1500;
                }
                System.out.println("Total a pagar: $" + total);
                break;

            case 2:
                if (horas == 1) {
                    total = 4000;
                } else {
                    total = 4000 + (horas - 1) * 3000;
                }
                System.out.println("Total a pagar: $" + total);
                break;

            case 3:
                if (horas == 1) {
                    total = 5000;
                } else {
                    total = 5000 + (horas - 1) * 4000;
                }
                System.out.println("Total a pagar: $" + total);
                break;

            default:
                System.out.println("La opcion no es valida");
        }

        sc.close();
    }
}