import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un letra:");
       String letra = input.nextLine();
        //char letra = 'a';
        //letra =Character.toLowerCase(letra);
        if (  letra.equals("a")  || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ){
            System.out.println("Es una vocal");
        }
        else  {
            System.out.println("No es una vocal");

        }
    }
}
