
/**
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio3_CostoEnvioPaquete {

    public static void main(String[] args) {
        double pesoProd, costo;
        int ubicacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingre el peso del producto: ");
        pesoProd = tcl.nextDouble();
        System.out.println("Seleccione la región: ");
        System.out.println("1. Local");
        System.out.println("2. Nacional");
        System.out.println("3. Otra");
        ubicacion = tcl.nextInt();
        
        if (pesoProd < 5 && ubicacion == 1) {
            costo = 5;
        } else if (pesoProd >= 5 && pesoProd <= 10 && ubicacion == 2) {
            costo = 10;
        } else {
            costo = 15;
        }
        System.out.println("El costo de envio es: $" + costo);
    }
}
/***
 * run:
 *Ingre el peso del producto: 10
 *Ingrese la region (local/nacional/otra): nacional
 *El costo de envio es: $10.0
 */
