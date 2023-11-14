package ejercicio5_taller5;
import java.util.Scanner;
public class Ejercicio5_Taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anioBisiesto;
        System.out.println("Ingrese el anio");
        anioBisiesto = teclado.nextInt();
        if((anioBisiesto % 4 == 0 && anioBisiesto % 100 != 0) || anioBisiesto % 400 == 0)
            System.out.println("El anio es bisiesto");
        else
            System.out.println("El anio no es bisiesto");
    }
    
}
