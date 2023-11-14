package javaapplication15;

import java.util.Scanner;

public class ejercicio_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Ingrese tres números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        if (n1 >= n2 && n2 >= n3) {
            System.out.println("Los numeros en orden son: " + n3 + ", " + n2 + ", " + n1);
        } else if (n1 >= n3 && n3 >= n2) {
            System.out.println("Los numeros en orden son: " + n2 + ", " + n3 + ", " + n1);
        } else if (n2 >= n3 && n3 >= n1) {
            System.out.println("Los numeros en orden son: " + n1 + ", " + n3 + ", " + n2);
        } else if (n2 >= n1 && n1 >= n3) {
            System.out.println("Los numeros en orden son: " + n3 + ", " + n1 + ", " + n2);
        } else if (n3 >= n2 && n2 >= n1) {
            System.out.println("Los numeros en orden son: " + n1 + ", " + n2 + ", " + n3);
        } else if (n3 >= n1 && n1 >= n2) {
            System.out.println("Los numeros ordenados: " + n2 + ", " + n1 + ", " + n3);
        }
    }
}
