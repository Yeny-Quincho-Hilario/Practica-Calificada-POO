import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        Vehiculo vehiculooo = new Vehiculo();

        System.out.println("==== REGISTRO DE VEHICULOS==== ");
        System.out.println("Ingrese la Marca del vehiculo: ");
        vehiculooo.setMarca(input.nextLine());

        System.out.println("Ingrese el modelo del vechiculo: ");
        vehiculooo.setModelo(input.nextLine());

        System.out.println("Ingrese el año de fabricacion: ");
        vehiculooo.setAñoFab(input.nextInt());

        System.out.println(" Ingrese la velocidad actual (km/h): ");
        vehiculooo.setVelocidad(input.nextDouble());

        System.out.println("Opciones.......");
        System.out.println("1. Acelerar vehiculo");
        System.out.println("2. Frenar vehiculo");
        System.out.println("3. Consultar Antiguedad de vehiculo");
        System.out.println("4. Salir");

        System.out.println( "Seleccione una opcion: ");
        int opcion = input.nextInt();

        switch (opcion){
            case 1:
                System.out.println(vehiculooo.Acelerar());
                break;
            case 2:
                System.out.println(vehiculooo.Frenar());
                break;
            case 3:
                System.out.println("El vehiculo tiene " + vehiculooo.calcularEdad() + " años de antiguedad."); ;//String.valueOf(vehiculooo.calcularEdad());---para convertir de int a string
                System.out.println("Estado del vehiculo: " + vehiculooo.EstadoVehiculo());
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                //System.exit(0);
                break;
            default:
                System.out.println("La opcion elegida, no es válido");
                break;
        }

    }
}