import java.util.Scanner;

public class TALLER43 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        String[] pacientes = new String[8];

        for (int i = 0; i <= 7; i++) {
            System.out.print("Ingrese el nombre del paciente " + (i + 1) + ": ");
            pacientes[i] = entrada.nextLine();
        }

     
        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = entrada.nextLine();

      
        int posicion = -1;

    
        for (int i = 0; i <= 7; i++) {

            // Comparar sin distinguir mayúsculas
            if (pacientes[i].equalsIgnoreCase(nombreBuscado)) {
                posicion = i;
                break; 
            }
        }

        
        if (posicion != -1) {
            System.out.println("Encontrado en posición " + posicion);
        } else {
            System.out.println("No encontrado");
        }

        entrada.close();
    }
}