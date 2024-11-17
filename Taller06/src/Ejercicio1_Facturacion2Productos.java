
/**
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio1_Facturacion2Productos {

    public static void main(String[] args) {
        double costoProd1, costoProd2, costoAmbosProd, costoEnvio, iva, descuento = 0, subTotal, costoFinal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame tres costos (2 del producto + 1 de envio): ");
        costoProd1 = tcl.nextDouble();
        costoProd2 = tcl.nextDouble();
        costoEnvio = tcl.nextDouble();
        costoAmbosProd = costoProd1 + costoProd2;
        iva = (costoProd1 + costoProd2) * 0.10;
        subTotal = (iva + costoProd1 + costoProd2);
        costoFinal = subTotal + costoEnvio;

        if (subTotal == 1000) {
            descuento = subTotal * 0.05;
            costoFinal = subTotal - descuento + costoEnvio;
            System.out.println("El costo de ambos productos es de:" + "$" + costoAmbosProd);
            System.out.println("Los impuestos por los productos son: " + iva);
            System.out.println("El costo del los productos mas el iva es de: " + subTotal);
            System.out.println("En su compra se aplico el descuento del 5% que es de :" + descuento);
            System.out.println("El costo final es de = " + "$" + costoFinal);
        }
        if (subTotal > 1000 && subTotal < 5000) {
            descuento = subTotal * 0.20;
            costoFinal = subTotal - descuento + costoEnvio;
            System.out.println("El costo de ambos productos es de:" + "$" + costoAmbosProd);
            System.out.println("Los impuestos por los productos son:" + "$" + iva);
            System.out.println("El costo del los productos mas el iva es de:" + subTotal);
            System.out.println("En su compra se aplico el descuento del 20% que es de :" + descuento);
            System.out.println("El costo final es de :" + costoFinal);
        }
        if (subTotal > 5000) {
            costoFinal = subTotal - costoEnvio;
            System.out.println("El costo de ambos productos es de:" + "$" + costoAmbosProd);
            System.out.println("Los impuestos por los productos son:" + "$" + iva);
            System.out.println("El costo del los productos mas el iva es de: " + subTotal);
            System.out.println("Por su compra superior a $5000 el envio sera gratuito");
            System.out.println("El costo final es de :" + costoFinal);
        }
        if (subTotal < 1000) {
            System.out.println("El costo de ambos productos es de:" + "$" + costoAmbosProd);
            System.out.println("Los impuestos por los productos son:" + "$" + iva);
            System.out.println("El costo del los productos mas el iva es de:" + subTotal);
            System.out.println("En su compra no se aplico descuentos");
            System.out.println("El costo total de los dos producto es de:" + "$" + costoFinal);
        }

    }
}
/***
 * run:
 *Dame tres costos (2 del producto + 1 de envio): 900 50 10
 *El costo de ambos productos es de:$950.0
 *Los impuestos por los productos son:$95.0
 *El costo del los productos mas el iva es de: 1045.0
 *En su compra se aplico el descuento del 20% que es de :209.0
 *El costo final es de :846.0
 */
