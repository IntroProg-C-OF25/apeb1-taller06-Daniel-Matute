
/**
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Examen_Parcial {

    public static void main(String[] args) {
        double acd, ape, aa, acd2, ape2, aa2, bimes1, bimes2, recuperacion = 0, notaTotal, acu, fnal;
        String estad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su calificacion obtenida en ACD del primer bimestre: ");
        acd = tcl.nextDouble();
        System.out.print("Ingrese su calificacion obtenida en APE del primer bimestre: ");
        ape = tcl.nextDouble();
        System.out.print("Ingrese su calificacion obtenida en AA del primer bimestre: ");
        aa = tcl.nextDouble();
        bimes1 = acd + ape + aa;
        System.out.println("Su promedio obtenido en el primer bimestre es de: " + bimes1);
        System.out.print("Ingrese su calificacion obtenido en ACD del segundo bimestre: ");
        acd2 = tcl.nextDouble();
        System.out.print("Ingrese su calificacion obtenido en APE del segundo bimestre: ");
        ape2 = tcl.nextDouble();
        System.out.print("Ingrese su calificacion obtenido en AA del segundo bimestre: ");
        aa2 = tcl.nextDouble();
        bimes2 = acd2 + ape2 + aa2;
        System.out.println("Su promedio obtenido en el segunod bimestre es de: " + bimes2);
        notaTotal = (bimes1 + bimes2) / 2;
        System.out.println("Su nota final es de: " + notaTotal);
        acu = (aa + aa2) / 2;
        fnal = notaTotal;
        if (notaTotal < 6.5) {
            System.out.println("Estas en Recuperacion, dame tu nota");
            recuperacion = tcl.nextDouble();
            fnal = recuperacion + acu;
        }
        estad = (fnal < 6.5) ? "Reprobado" : "Aprobado";
        System.out.printf("%s\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s\t%s\n",
                "NOMBRE", "ACDB1", "APEB2", "AAB1", "BIM1",
                "ACDB2", "APEB2", "AAB2", "BIM2",
                "TOTALFIN", "ACU", "RECUPERACION", "FINAL", "ESTADO");
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t\t%.2f\t%.2f\t\t%.2f\t%s\n",
                "CRISTIAN", acd, acd2, aa, bimes1,
                acd2, ape2, aa2, bimes2,
                notaTotal, acu, recuperacion, fnal, estad);
    }
}
