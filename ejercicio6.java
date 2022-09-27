import java.util.Scanner;
/*Realiza un programa donde el usuario tenga que introducir 3 números y el programa calcule cuál de ellos es el mayor de todos. Lo mostrará por pantalla.  */
public class ejercicio6 {
    public static void main(String[] args) {
        int a=0,b=0,c;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca el primer numero: ");
        a= entrada1.nextInt ();
        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nIntroduzca el segundo numero: ");
        b = entrada2.nextInt ();
        Scanner entrada3=new Scanner (System.in);
        System.out.println (" \nIntroduzca el tercer numero: ");
        c = entrada3.nextInt ();

        if((a>b)&&(a>c))
        {
            System.out.printf("El numero mayor es "+a+".");
        }
        else if((b>a)&&(b>c))
        {
            System.out.printf("El numero mayor es "+b+".");
        }
        else if((c>a)&&(c>b))
        {
            System.out.printf("El numero mayor es "+c+".");
        }
    }
}
