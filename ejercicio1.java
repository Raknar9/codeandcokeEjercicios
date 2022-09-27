import java.util.Scanner;
 /*Haz un programa que solicite dos números y diga si son o no iguales  */
public class ejercicio1 {
    public static void main(String[] args) {
        int i=0,j=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nPrimer numero: ");
        i = entrada1.nextInt ();

        Scanner entrada2=new Scanner (System.in);
        System.out.println ("Segundo numero: ");
        j = entrada2.nextInt ();
        if(i==j)
        {
            System.out.printf("Los numeros son iguales");
        }
        else {
            System.out.printf("Los numeros no son iguales");
        }
    }
}
