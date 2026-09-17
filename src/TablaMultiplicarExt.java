import java.util.Scanner;


public class TablaMultiplicarExt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 12) {
                    System.out.print((i * j) + ".");
                } else {
                    System.out.print((i * j) + ", ");
                }
            }
            System.out.println(); 
        }
    }
}
