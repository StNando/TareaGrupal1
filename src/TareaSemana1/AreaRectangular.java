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
public class AreaRectangular {
   public static void main(String[] args) {
    float b;
    float a;
    float area;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Base del rectangulo: ");
    b = scanner.nextFloat();

    System.out.println("Altura del rectangulo: ");
    a = scanner.nextFloat();

    area = a * b;

    System.out.print("Area del rectangulo es: " + area);
  }
}
 
