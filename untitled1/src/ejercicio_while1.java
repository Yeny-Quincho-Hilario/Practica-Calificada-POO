import java.util.Scanner;
public class ejercicio_while1 {
    public static void main(String[] args) {

        // declaracion de variables
        int valorFinal = 0;

        // Captura de datos
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor final a suma: ");
        valorFinal = input.nextInt();
        int acumulador = 0;
        int contador = 1;
        while ( contador <= valorFinal ){
            acumulador = acumulador + contador;
            contador += 1;
        }
        System.out.println("La suma de los "+valorFinal+" numeros primeros es igual a"+acumulador);
    }
}
