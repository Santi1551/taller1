import java.util.Scanner;


public class CalculoNomina {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nombreEmpleado;
        double salarioBruto;
        double valorHora;
        double horasTrabajadas;
        double seguridadSocial;
        double retencion;
        double salarioNeto;

        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = scanner.nextDouble();
        System.out.print("Ingrese el valor de la hora: ");
        valorHora = scanner.nextDouble();
        salarioBruto = horasTrabajadas * valorHora;
        seguridadSocial = salarioBruto * 0.08;
        retencion = salarioBruto * 0.05;
        salarioNeto = salarioBruto - seguridadSocial - retencion;

        System.out.print("El empleado " + nombreEmpleado + " tiene un salario bruto de: $" + salarioBruto);
        System.out.print("\nTiene un descuento de seguridad social de :  $" + seguridadSocial);
        System.out.print("\nTiene un descuento de Retencion de  :  $" + retencion);
        System.out.print("\nEl salario neto es:  $" + salarioNeto);

    }
}
