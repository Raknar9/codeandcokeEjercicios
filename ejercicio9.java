import java.util.Scanner;
/* Realiza un programa que comience solicitando al usuario dos números cualesquiera.
El programa tendrá que mostrar por pantalla la secuencia completa de números enteros que vayan desde el número menor al mayor de los introducidos.
 Por ejemplo, si el usuario introduce los números 20 y 12 el programa hará aparecer la siguiente secuencia (uno por línea): 12, 13, 14, 15, 16, 17, 18, 19, 20. */
public class ejercicio9 {
    public static void main(String[] args) {
        int a=0,b=0;
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
                System.out.printf(""+a+"\n");
                a++;

            }
        }
        else if(b<a)
        {
            while(b<=a)
            {
                System.out.printf(""+b+"\n");
                b++;
            }
        }
    }
}
