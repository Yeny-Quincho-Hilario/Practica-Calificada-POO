import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de estudiantes: ");
        int cantidadEstudiantes = input.nextInt();
        input.nextLine(); // limpiar el buffer de entrada después de nextInt()

        // Bucle para ingresar datos de cada estudiante
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("\nAlumno " + (i + 1)); // imprime con salto de linea alumno 1, alumno 2.............etc

            //INSTANCIA -----(Llamaremos a la clase prom) -----------// Crear una nueva instancia de promedioo
            Promedio alumno = new Promedio();
            System.out.print("Ingresa el nombre del estudiante: ");
            alumno.setNombre(input.nextLine());

            // Ingresar las cuatro notas
            System.out.print("Ingresa la nota 1: ");
            alumno.setNota1(input.nextInt());

            System.out.println("Ingresa la nota 2: ");
            alumno.setNota2(input.nextInt());

            System.out.println("Ingresa la nota 3: ");
            alumno.setNota3(input.nextInt());

            System.out.println("Ingresa la nota 4: ");
            alumno.setNota4(input.nextInt());

            input.nextLine(); // Limpiar el buffer después de nextInt()

            System.out.println("Nombre del alumno: " + alumno.getNombre());
            System.out.println("Promedio es: " + alumno.PromedioFinal());
            System.out.println("Condición es: " + alumno.CondicionFinal());
        }
        input.close(); // cierra el scanner


        /*// INSTANCIA----- (llamaremos a la clase Promedio)

        Promedio alumn01 = new Promedio();
        alumn01.setNombre("Luis");
        alumn01.setNota1(15);
        alumn01.setNota2(14);
        alumn01.setNota3(10);
        alumn01.setNota4(8);
        System.out.println("Nombre del alumno:"+alumn01.getNombre());
        System.out.println("Promedio es:"+alumn01.PromedioFinal());
        System.out.println("Condicion es"+alumn01.CondicionFinal());



        Promedio alumn02 = new Promedio();
        alumn02.setNombre("Jhon");
        alumn02.setNota1(10);
        alumn02.setNota2(15);
        alumn02.setNota3(15);
        alumn02.setNota4(18);
        System.out.println("Nombre del alumno:"+alumn02.getNombre());
        System.out.println("Promedio es:"+alumn02.PromedioFinal());
        System.out.println("Condicion es"+alumn02.CondicionFinal());*/

    }
}