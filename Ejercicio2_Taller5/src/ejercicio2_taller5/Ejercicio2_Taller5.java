package ejercicio2_taller5;
import java.util.Scanner;
public class Ejercicio2_Taller5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaSemana;
        System.out.println("Ingrese un número del 1 al 7");
        diaSemana = teclado.nextInt();
        if (diaSemana == 1)
            System.out.println("Hoy es Lunes");
        else
            if (diaSemana == 2)
                System.out.println("Hoy es Martes");
        else
                if (diaSemana == 3)
                    System.out.println("Hoy es Miércoles");
        else
                    if (diaSemana == 4)
                        System.out.println("Hoy es Jueves");
        else
                        if (diaSemana == 5)
                            System.out.println("Hoy es Viernes");
        else
                            if (diaSemana == 6)
                                System.out.println("Hoy es Sábado");
        else
                                if (diaSemana == 7)
                                    System.out.println("Hoy es Domingo");
        else
                                    if (diaSemana >= 8)
                                        System.out.println("Número no válido");
    }
    
}
