import java.util.Scanner;
/*Realiza un programa que comience solicitando al usuario dos números cualesquiera. A continuación, tendrá que mostrar,
de forma similar al ejercicio anterior, la secuencia de números entre los que ha introducido el usuario, pero sólo mostrará los pares.
 Por ejemplo, si el usuario introduce el 10 y el 20, el programa hará aparecer la siguiente secuencia por pantalla: 10, 12, 14, 16, 18, 20*/
public class ejercicio10 {
    public static void main(String[] args) {
        int a,b;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca el primer numero: ");
        a= entrada1.nextInt ();
        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nIntroduzca el segundo numero: ");
        b = entrada2.nextInt ();
        if(a<b)
        {

            while(a<=b)
            {
                if(a%2==0)
                {
                    System.out.printf(""+a+"\n");
                }

                a++;
            }
        }
        else if(b<a)
        {
            while(b<=a)
            {
                if(b%2==0)
                {
                    System.out.printf(""+b+"\n");
                }

                b++;
            }
        }
    }
}
