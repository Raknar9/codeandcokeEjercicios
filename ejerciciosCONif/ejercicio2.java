package ejerciciosCONif;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int i=0;
        Scanner entrada1=new Scanner (System.in);


        System.out.println (" \nSueldo: ");
        i = entrada1.nextInt ();
        if(i>9000){
            System.out.printf("debe abonar impuestos");
        }
        else {
            System.out.printf("no debe abonar nada");
        }

    }
}
