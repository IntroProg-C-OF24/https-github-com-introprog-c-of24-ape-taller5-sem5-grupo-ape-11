package ejercicio4_taller5;
import java.util.Scanner;
public class Ejercicio4_Taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double producto, descuento;
        System.out.println("Ingresa el precio del producto");
        producto = teclado.nextDouble();
        if (producto > 100){
            descuento = producto * 0.1;
            producto = producto - descuento;
            System.out.println("El precio final del producto es: " + producto);
        } 
        else
            if (producto <= 100)
        System.out.println("El precio final sin descuento es : " + producto); 
       
    }
}
