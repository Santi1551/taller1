import java.util.Scanner;

public class InversionArreglo {
   public InversionArreglo() {
   }

   public static void main(String[] var0) throws Exception {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Ingrese el tamaño del arreglo: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Ingrese los elementos del arreglo:");

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.println("Arreglo original:");

      for(int var6 = 0; var6 < var2; ++var6) {
         System.out.print(var3[var6] + " ");
      }

      System.out.println();

      for(int var7 = 0; var7 < var2 / 2; ++var7) {
         int var5 = var3[var7];
         var3[var7] = var3[var2 - 1 - var7];
         var3[var2 - 1 - var7] = var5;
      }

      System.out.println("Arreglo invertido:");

      for(int var8 = 0; var8 < var2; ++var8) {
         System.out.print(var3[var8] + " ");
      }

      System.out.println();
   }
}