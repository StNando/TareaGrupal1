/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSemana1;
import java.util.Scanner;
/**
 *
 * @author Nando
 */
public class ImporteIGV {
   public static void main(String[] args) {
    double total;
    double igv;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el monto de la compra: S/ ");
    total = scanner.nextDouble();

    igv = total * 0.18;

    System.out.println("El importe de IGV es: S/" + igv);
  }  
}
