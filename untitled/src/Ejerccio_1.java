
import java.util.Scanner;
public class Ejerccio_1 {
    static final double PI=3.1416;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radio;
        System.out.println("Dime el radio ");
        radio = input.nextInt();
        double area = PI*Math.pow(radio,2);
        System.out.println("El area es de: "+ area);

    }
}
