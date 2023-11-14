
import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorK, kilovatiosMes, edad, valorPlanilla, descuento;
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextDouble();
        System.out.println("Ingrese el valor del kilovatio por hora");
        valorK = teclado.nextDouble();
        System.out.println("Ingrese el valor de los kilovatios consumidos en el mes");
        kilovatiosMes = teclado.nextDouble();
        valorPlanilla = valorK * kilovatiosMes;
        if (edad > 65) {
            descuento = valorPlanilla * 0.1;
            valorPlanilla = valorPlanilla - descuento;
        }
        System.out.println("El valor de la planilla es: " + valorPlanilla);
    }

}
