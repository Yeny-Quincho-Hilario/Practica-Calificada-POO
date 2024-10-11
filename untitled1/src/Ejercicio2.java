import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Ingrese un numero:");
        num1 = input.nextInt();
        if (num1 > 0) {
            System.out.println("Es un numero positivo");
        }
        else if (num1 == 0)        {
            System.out.println("Es un numero neutro");
        }
       else{
            System.out.println("Es un numero negativo");
        }
    }
}
