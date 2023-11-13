package ejercicio3_taller5;
import java.util.Scanner;
public class Ejercicio3_Taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, numC, max;
        System.out.println("Ingrese el primer número");
        numA = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        numB = teclado.nextInt();
        System.out.println("Ingrese eltercer número");
        numC = teclado.nextInt();
        if (numA > numB)
            max = numA;
        else 
            max = numB;
        if (max > numC)
            System.out.println("El mayor es: " + max);
        else
            System.out.println("El mayor es: " + numC);
    }
    
}
