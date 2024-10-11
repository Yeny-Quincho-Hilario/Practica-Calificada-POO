import java.util.Scanner;
public class ejerccio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();

        System.out.println("Ingrese el tercer numero:");
        num3 = input.nextInt();

        int num_mayor = num1 ;

        if (num2>num_mayor){
             num_mayor =num2;
         }
        if (num3>num_mayor){
             num_mayor = num3;
         }
         System.out.println("El numero mayor es:"+ num_mayor);
    }
}
