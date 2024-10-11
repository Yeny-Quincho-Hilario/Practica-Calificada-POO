import java.util.Scanner;
public class ejercicio_while2 {
    public static void main(String[] args) {


        // Captura de datos
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor iniciall : ");
        int valorInicial = input.nextInt();

        System.out.println("Ingrese el valor final : ");
        int valorFinal= input.nextInt();

        int cantidadPares = 0;

        while ( valorInicial  <= valorFinal ){

             if (valorInicial % 2 == 0){
                 cantidadPares += 1;
             }
            valorInicial +=1;
        }
        System.out.println(cantidadPares);
    }
}
