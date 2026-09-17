import java.util.Scanner;


public class ValidacionEntrada {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int edad;
        do {
            System.out.print("Ingrese su edad: ");
           edad = scanner.nextInt();
            if (edad < 0 || edad > 120) {
                System.out.println("Edad inválida. Por favor, ingrese una edad entre 0 y 120.");
            } else {
                System.out.println("Edad ingresada correctamente: " + edad);
                break;
            }
        }while (true);
        if (edad < 12) {
            System.out.println("Te encuentras en tu etapa de niñez.");
        } else if(edad <=17) {
            System.out.println("Te encuentras en tu etapa de adolescencia.");
        } else if(edad <= 25) {
            System.out.println("Te encuentras en tu etapa de Juventud.");
        } else if(edad <= 59) {
            System.out.println("Te encuentras en tu etapa de adultez.");
        } else if(edad >= 60) {
            System.out.println("Te encuentras en tu etapa de vejez.");
        }
    }
}
