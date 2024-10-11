
import java.util.Scanner;
public class Ejercicio3_pract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();

        System.out.println("Ingrese el tercer numero:");
        num3= input.nextInt();

        int numMayor = 0,  numMedio=0, numMenor=0;
        if (num1 <=num2 && num1<= num3){
            numMenor = num1;
            if(num2 <= num3){
                numMedio= num2;
                numMayor = num3;
            }
            else{
                numMedio = num3;
                numMayor= num2;
            }
        }
        else if( num2 <= num1 && num2 <= num3){
            numMenor = num2;
            if(num1 <= num3){
                numMedio = num1;
                numMayor = num3;
            }
            else {
                numMedio = num3;
                numMayor = num1;
            }
        }
        else if ( num3 <= num1 && num3 <= num2){
            numMenor = num3;
            if (num2 <= num1){
                numMedio = num2;
                numMayor = num1;
            }
            else{
                numMedio = num1;
                numMayor = num2;
            }

        }
        System.out.println(numMenor + ", "+ numMedio +", " + numMayor);


    }
}
