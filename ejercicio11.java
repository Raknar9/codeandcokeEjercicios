import java.util.Scanner;

public class ejercicio11
{
    public static void main(String[] args)
    {
        int a,b;
        int op;

        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca el primer numero: ");
        a= entrada1.nextInt ();
        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nIntroduzca el segundo numero: ");
        b = entrada2.nextInt ();

        System.out.print("Quieres imprimir los pares o los impares: ");
        System.out.printf("1-Par ");
        System.out.printf("2-Impar");
        System.out.println (" \nOpcion: ");
        Scanner entrada3=new Scanner (System.in);
        op= entrada3.nextInt ();
        if(op==1)
        {
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
        else if (op==2)
        {
            if(a<b)
            {
                while(a<=b)
                {
                    if(a%2!=0)
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
                    if(b%2!=0)
                    {
                        System.out.printf(""+b+"\n");
                    }
                    b++;
                }

            }

        }




    }


    public static int menu(int opcion)
    {   int op,a;
        System.out.printf("Quieres imprimir los pares o los impares: ");
        System.out.printf("1-Par ");
        System.out.printf("2-Impar");
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nOpcion: ");
        a= entrada1.nextInt ();
        op=a;

        return op;
    }
}
