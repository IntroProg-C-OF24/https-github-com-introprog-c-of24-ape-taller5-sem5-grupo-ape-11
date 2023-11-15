package ejercicio_13;
import java.util.Scanner;
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diasHosteria;
        double costoDia, descuento, subtotal, totalPagar;
        System.out.println("Ingrese los días que se hospedará: ");
        diasHosteria = teclado.nextInt();
        System.out.println("Ingrese el valor de su habitación por noche");
        costoDia = teclado.nextDouble();
        subtotal = diasHosteria * costoDia;
        totalPagar = diasHosteria * costoDia;
        descuento = 0;
        if (diasHosteria > 15){
            descuento = totalPagar * 0.2;
            totalPagar = totalPagar - descuento;
        }
        else {
            if (diasHosteria > 10){
                descuento = totalPagar * 0.15;
                totalPagar = totalPagar - descuento;
            }
            else{
                if (diasHosteria > 5){
                    descuento = totalPagar * 0.1;
                    totalPagar = totalPagar - descuento;
                }
            }
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}
