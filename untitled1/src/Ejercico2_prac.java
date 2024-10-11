import java.util.Scanner;

public class Ejercico2_prac {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int num1;

            System.out.println("Ingrese un numero:");
            num1 = input.nextInt();
            int resul = num1 % 2;
            if (resul == 0) {
                resul = num1 * 2;
            }

            else{
               resul = num1 * 3;
            }
        System.out.println("el valor es: "+ resul);
    }
}


