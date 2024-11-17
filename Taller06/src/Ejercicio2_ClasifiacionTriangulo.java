
/**
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio2_ClasifiacionTriangulo {

    public static void main(String[] args) {
        double valor1, valor2, valor3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese los valores de las longitudes de un triangulo: ");
        valor1 = tcl.nextDouble();
        valor2 = tcl.nextDouble();
        valor3 = tcl.nextDouble();
        if (valor1 + valor2 <= valor3 || valor1 + valor3 <= valor2 || valor2 + valor3 <= valor1) {
            System.out.println("No es un triangulo");
        }
        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("Triangulo equilatero");
        }
        if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
            System.out.println("Triangulo isosceles");
        } else {
            System.out.println("Triangulo escaleno");
        }

    }

}
/***
 * run:
 *Ingrese los valores de las longitudes de un triangulo: 10 9 8
 *Triangulo escaleno
 */
