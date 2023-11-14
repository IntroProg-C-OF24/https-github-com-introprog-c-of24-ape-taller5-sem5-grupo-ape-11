package ejercicio1_taller5;
import java.util.Scanner;
public class Ejercicio1_Taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        if (edad >= 18)
            System.out.println("Ciudadano listo para votar");
        else
            System.out.println("Ciudadano aún no listo para votar");
}
}