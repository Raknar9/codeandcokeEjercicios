import java.util.Scanner;

public class ejercicioFOr {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i=0;i<10;i++)
        {
            Scanner sc= new Scanner(System.in);
            array[i]= sc.nextInt();
        }

        int n=0;


           for (int j=0;j<10;j++)
           {
               if(array[j]>n)
               {
                   n=array[j];
               }
           }
        System.out.printf("el mayor es "+n);
    }
}
