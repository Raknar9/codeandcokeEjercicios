package ejerciciosCONif;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int i=0,a;
        Scanner entrada1=new Scanner (System.in);


        System.out.println (" \nNumero: ");
        i = entrada1.nextInt ();
        System.out.println (" \nNumero: ");
        a = entrada1.nextInt ();
        if(i<a)
        {
            System.out.printf("el primer numero es mayor");
        }
        else
        {
            System.out.printf("el primer numero no es mayor");
        }
    }
}
