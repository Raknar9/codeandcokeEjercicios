import java.util.Scanner;
/*Realiza un programa que solicite tres números y los pinte en la pantalla ordenados de menor a mayor.
Si el usuario introduce el 10, el 20 y el 2, el programa mostrará: “2 10 20”  */
public class ejercicio3  {
    public static void main(String[] args) {
        int i=0,j=0,z=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nPrimer numero: ");
        i = entrada1.nextInt ();

        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nSegundo numero: ");
        j = entrada2.nextInt ();

        Scanner entrada3=new Scanner (System.in);
        System.out.println (" \nTercer numero: ");
        z= entrada3.nextInt ();

        if((i<j)&&(i<z))
        {
            System.out.printf(" "+i+" ");
            if(j<z)
            {
                System.out.printf(""+j+" " +z+" ");
            }
            else {
                System.out.printf(""+z+" "+j+" ");
            }
        }
        else if ((j<i)&&(j<z))
        {
            System.out.printf(""+j+" ");
            if(i<z)
            {
                System.out.printf(""+i+" "+z+" ");
            }
            else
            {
                System.out.printf(""+z+" "+i+" ");
            }
        }
        else if((z<i)&&(z<j))
                {
                    System.out.printf(""+z+" ");
                    if(i<j)
                    {
                        System.out.printf(""+i+" "+j+" ");
                    }
                    else
                    {
                        System.out.printf(""+j+" "+i+" ");
                    }
                }

    }
}
