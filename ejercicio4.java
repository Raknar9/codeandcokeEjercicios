import java.util.Scanner;
/* Realiza un programa que solicite un número entre 1 y 1000 e indique cuántos dígitos tiene */
public class ejercicio4 {
    public static void main(String[] args) {
        int i=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nNumero: ");
        i = entrada1.nextInt ();
        if(i<10)
        {
            System.out.printf("El numero tiene 1 digito");
        }
        else if(i<100)
        {
            System.out.printf("El numero tiene 2 digitos");
        }
        else if(i<1000)
        {
            System.out.printf("El numero tiene 3 digitos");
        }
        else if(i==1000)
        {
            System.out.printf("El numero tiene 4 digitos");
        }
        else {
            System.out.printf("ERROR!!");
        }

    }
}
