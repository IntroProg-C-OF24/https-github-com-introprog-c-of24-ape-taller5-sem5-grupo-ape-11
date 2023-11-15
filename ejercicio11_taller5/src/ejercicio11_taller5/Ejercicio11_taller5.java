package ejercicio11_taller5;
import java.util.Scanner;
public class Ejercicio11_taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreProducto;
        double costoProducto, cantiUnidad, precioFinal, descuento;
        System.out.println("Pon el nombre del producto que requieres");
        nombreProducto = teclado.nextLine();
        System.out.println("Pon la cantidad de unidades que requieres");
        cantiUnidad = teclado.nextDouble();
        System.out.println("Pon el costo del producto");
        costoProducto = teclado.nextDouble();
        precioFinal = costoProducto * cantiUnidad;
        if (cantiUnidad > 50){
            descuento = precioFinal * 0.15;
            precioFinal = precioFinal - descuento;
        }
        System.out.println("Costo por unidad de " + nombreProducto + ": " + costoProducto );
        System.out.println("Unidades: " + cantiUnidad);
        System.out.println("TOTAL: " + precioFinal);
    }
    
}
