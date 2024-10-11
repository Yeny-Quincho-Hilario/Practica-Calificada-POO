import java.util.Scanner;
public class Ejercicio5_pract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double consumo;

        System.out.println("Ingrese monto de consumo:");
        consumo = input.nextDouble();
        double impuesto = 0.19 * consumo;
        double descuento =0, importe=0;
        if (consumo<=100){
            importe = consumo - (consumo*0.10);
            descuento = (consumo*0.10);
        }
        else if (consumo>100 && consumo<200)
        {
            importe = consumo - (consumo*0.20);
            descuento = (consumo*0.20);

        }
        else if (consumo>200 && consumo <300) {
            importe = consumo - (consumo*0.30);
            descuento = (consumo*0.30);

         } else{

            System.out.println("el importe no es valido");
        }

        System.out.println("el descuento es de: "+ descuento);
        System.out.println("el impuesto es de: "+ impuesto);
        System.out.println("el importe  es de: "+ importe);
    }
}
