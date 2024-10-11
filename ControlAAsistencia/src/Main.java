import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Asistencia asistenciaa = new Asistencia();

        System.out.println("========CONTROL DE ASISTENCIA========");
        System.out.println("Ingrese el nombre del estudiante: ");
        asistenciaa.setNombreEst(input.nextLine());

        System.out.println("Ingrese la cantidad de dias asistidos: ");
        asistenciaa.setDiasAsist(input.nextInt());

        System.out.println("Calculando porcentaje de asistencia.....");

        System.out.println("El porcentaje de asistencia es: " +  asistenciaa.PorcentajeAsistencia() +"%" );
        //System.out.println("El porcentaje de asistencia es: " +  asistenciaa.PorcentajeAsistencia() +"%" );
        System.out.println("Estado del estudiante: " + asistenciaa.EstadoEstudiante());
        System.out.println("===========================");

    }
}