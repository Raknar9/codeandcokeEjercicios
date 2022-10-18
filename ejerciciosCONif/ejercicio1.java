package ejerciciosCONif;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int i=0;
        Scanner entrada1=new Scanner (System.in);


        System.out.println (" \nNumero: ");
        i = entrada1.nextInt ();
        if(i%2==0)
        {
            System.out.printf("es par");
        }
        else
        {
            System.out.printf("es impar");
        }

    }


}
