import java.util.Scanner;

public class Ejercicoio4_prac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double consumo;

        System.out.println("Ingrese monto de consumo:");
       consumo = input.nextDouble();
       double impuesto = 0.19 * consumo;
       double descuento, imp;
       if (consumo<=1000){
            imp = consumo - (consumo*0.10);
           descuento = (consumo*0.10);
        }
       else
       {
           imp = consumo - (consumo*0.25);
           descuento = (consumo*0.25);
       }


        System.out.println("el descuento es de: "+ descuento);
        System.out.println("el impuesto es de: "+ impuesto);
        System.out.println("el importe  es de: "+ imp);
    }
}
