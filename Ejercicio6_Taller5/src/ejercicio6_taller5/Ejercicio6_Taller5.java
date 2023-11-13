package ejercicio6_taller5;
import java.util.Scanner;
public class Ejercicio6_Taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        if (edad >= 18)
            System.out.println("Es un Adulto");
        else
            if (edad >= 12)
                System.out.println("Es un Adolescente");
           else
                System.out.println("Es un bebé");
    }
    
}
