package javaapplication15;
import java.util.Scanner;
public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, altura, indiceMC;
        System.out.println("Ingrese su peso en kg: ");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su altura en m: ");
        altura = teclado.nextDouble();
        indiceMC = peso / (altura * altura);
        if(indiceMC < 18) {
            System.out.println("Su peso es bajo");
        }    
        else {
            if(indiceMC < 25){
                System.out.println("Su peso está dentro del promedio");
            }
            else {
                if(indiceMC < 30){
                    System.out.println("Su peso el alto");
                }        
                else {
                    System.out.println("Su peso es muy alto, tiene obesidad");
                }
            }    
        }
    }
    
}
