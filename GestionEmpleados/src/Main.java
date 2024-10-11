import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====  GESTIÓN DE EMPLEADOS ===== ");
        System.out.println("Ingresa la cantidad de empleados: ");
        int cantidadEmpleados = input.nextInt();
        input.nextLine(); // limpiar el buffer de entrada después de nextInt()

        // Bucle para ingresar datos de cada estudiante
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("\nEmpleado " + (i + 1));

            //INSTANCIA -----(Llamaremos a la clase prom) -----------// Crear una nueva instancia de promedioo
            Empleado empleado = new Empleado();

            System.out.println("Ingresa el nombre del empleado: ");
            empleado.setNombre(input.nextLine());

            // Ingresar las cuatro notas
            System.out.println("Ingrese las horas regulares trabajadas: ");
            empleado.setHorasReg(input.nextInt());

            System.out.println("Ingrese las horas extras trabajadas: ");
            empleado.setHorasExt(input.nextInt());

            System.out.println("Ingresa el valor por hora regular: ");
            empleado.setSalarioHora(input.nextInt());

            input.nextLine(); // Limpiar el buffer después de nextInt()

            System.out.println("Calculando salario......");
            System.out.println("El salario total de: " + empleado.getNombre() + " es " + empleado.salarioTotal());
            System.out.println("La categoria salarial es: " + empleado.CategoriaSalarial());
            System.out.println("===================================");
        }
        input.close(); // cierra el scanner
    }
}
