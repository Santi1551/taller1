import java.util.Scanner;

public class TiempoDeViaje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingresa los minutos totales: ");
        int minutos = sc.nextInt();

        int segundosTotales = (minutos * 60);
        int horas= (minutos/60);
        int minutos_2= (minutos%60);
        int segundos=(segundosTotales%60);

        System.out.println("El Tiempo ingresado: " + minutos + " minutos");
        System.out.println("Equivale a , " + horas + " horas" + minutos_2 + " minutos y " + segundos + " segundos.");
        System.out.println("En segundos " + segundosTotales);

       
        sc.close();
    }
}