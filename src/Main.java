import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in ) ;
        float []numero = new float [ 5];

        System.out.print("guardando los datos ");
        for (int i=0;i<5;i++){

            System.out.println((i+1)+" digite un numero :");
            numero [i]= entrada.nextFloat();
        }

        System.out.println(" elementos del arreglo");
        for (float a :numero){
            System.out.println(a);
        }
    }
}