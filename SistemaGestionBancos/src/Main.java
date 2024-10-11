import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("===== SISTEMA DE GESTIÓN DE BANCOS ===== ");

            // Crear una nueva instancia de cUENTA BANACARIA
            CuentaBancaria cuenta = new CuentaBancaria();

            System.out.println("Ingresa el nombre del titular: ");
            cuenta.setNombre(input.nextLine());

            System.out.println("Ingrese el saldo inicial de la cuenta: ");
            cuenta.setSaldoInical(input.nextDouble());

            System.out.println("Ingrese el tipo de cuenta (Ahorros/Corriente): ");
            cuenta.setTipoCuenta(input.nextLine());

            System.out.println( "OPCIONES: ");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. salir");

            System.out.println("Seleccione una opción : ");
            int opcion = input.nextInt();


            double saldoactual = 0;

            switch (opcion) {
                case 1 :
                    System.out.println("Ingrese el monto: ");
                    cuenta.setMontoIngreso(input.nextDouble());
                    System.out.println( "Saldo actualizado: " + cuenta.Depositos());
                    break;
                case 2:
                    System.out.println("Ingrese el monto: ");
                    cuenta.setMontoIngreso(input.nextDouble());
                    System.out.println( "Saldo actualizado: " + cuenta.Retiros());
                    break;
                case 3:
                    System.out.println( "Tu saldo es de: " + cuenta.getSaldoInical());
                    break;
                case 4:
                    System.out.println("Saliendo del programa.....");

                default:
                    System.out.println("La opcion elegida, no es valido");
                    break;
            }

            //input.nextLine(); // Limpiar el buffer después de nextInt()

            System.out.println("===================================");
        }
        //input.close(); // cierra el scanner
    }
