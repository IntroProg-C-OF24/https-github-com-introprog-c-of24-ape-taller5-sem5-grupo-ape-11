package ejercicio11_taller5;
import java.util.Scanner;
public class Ejercicio11_taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreProducto;
        double costoProducto, cantiUnidad, precioFinal, descuento;
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = teclado.nextLine();
        System.out.println("Ingrese la cantidad a comprar");
        cantiUnidad = teclado.nextDouble();
        System.out.println("Ingrese el costo del producto");
        costoProducto = teclado.nextDouble();
        precioFinal = costoProducto * cantiUnidad;
        if (cantiUnidad > 50){
            descuento = precioFinal * 0.15;
            precioFinal = precioFinal - descuento;
        }
        System.out.println("Costo del producto por unidad: " + nombreProducto + ": " + costoProducto );
        System.out.println("Unidades del producto: " + cantiUnidad);
        System.out.println("Pago Final: " + precioFinal);
    }
}
