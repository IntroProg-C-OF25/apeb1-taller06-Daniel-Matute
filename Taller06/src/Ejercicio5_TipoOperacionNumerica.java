
/**
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio5_TipoOperacionNumerica {

    public static void main(String[] args) {
        int operacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 4:");
        operacion = tcl.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Erro al ingresar el numero");
        }
    }
}
/***
 * run:
 *Ingrese un numero del 1 al 4:3
 *Multiplicacion
 */