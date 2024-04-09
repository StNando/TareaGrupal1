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
public class VolPrisma {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a, b, c;
    double result;

    System.out.println("Ingrese altura, ancho y longitud: ");
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();

    result = a * b * c;
    System.out.println("El volumen del prisma rectangular es: " + result + " u^3.");
  } 
}
