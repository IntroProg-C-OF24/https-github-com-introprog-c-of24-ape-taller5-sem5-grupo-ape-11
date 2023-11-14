import java.util.Scanner;
public class ejercicio_12 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        String marcaVehiculo, paisVehiculo;
        double costoVehiculo, precioVenta;
        System.out.println("Ingrese la marca de su veículo");
        marcaVehiculo = teclado.nextLine();
        System.out.println("Ingrese el país de donde viene su veículo");
        paisVehiculo = teclado.nextLine();
        System.out.println("Ingresa el costo del carro");
        costoVehiculo = teclado.nextDouble();
        if (paisVehiculo.equals("Alemania")){
            precioVenta = costoVehiculo * 0.2;
            costoVehiculo = costoVehiculo + precioVenta;
            System.out.println("Impuesto " + marcaVehiculo + ": " + precioVenta);
            System.out.println("TOTAL: " + costoVehiculo);
        }    
        else { 
            if (paisVehiculo.equals("Japon")){
                precioVenta = costoVehiculo * 0.3;
                costoVehiculo = costoVehiculo + precioVenta;
                System.out.println("Impuesto " + marcaVehiculo + ": " + precioVenta);
                System.out.println("TOTAL: " + costoVehiculo);
            }
            else {
                if (paisVehiculo.equals("Italia")){
                    precioVenta = costoVehiculo * 0.15;
                    costoVehiculo = costoVehiculo + precioVenta;
                    System.out.println("Impuesto " + marcaVehiculo + ": " + precioVenta);
                    System.out.println("TOTAL: " + costoVehiculo);
                }    
                else {
                    if (paisVehiculo.equals("USA")){
                        precioVenta = costoVehiculo * 0.08;
                        costoVehiculo = costoVehiculo + precioVenta;
                        System.out.println("Impuesto " + paisVehiculo + ": " + precioVenta);
                        System.out.println("TOTAL: " + costoVehiculo);
                    }    
                }
            }
        }
    }   
}