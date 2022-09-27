import java.util.Scanner;

public class ejercicio9DevariablesYopredadores {
    public static void main(String[] args) {
        int a,b,c,e,f,g;
        System.out.printf("Momento inicial: \n ");
        System.out.printf("================== \n");
        Scanner entrada1=new Scanner (System.in);
        System.out.println ("Introduce la hora: ");
        a= entrada1.nextInt ();
        Scanner entrada2=new Scanner (System.in);
        System.out.println ("Introduce los minutos: ");
        b = entrada2.nextInt ();
        Scanner entrada3=new Scanner (System.in);
        System.out.println ("Introduce los segundos: ");
        c = entrada3.nextInt ();
        System.out.printf("Momento final:. \n");
        System.out.printf("================== \n");
        Scanner entrada4=new Scanner (System.in);
        System.out.println ("Introduce la hora: ");
        e= entrada4.nextInt ();
        Scanner entrada5=new Scanner (System.in);
        System.out.println ("Introduce los minutos: ");
        f = entrada5.nextInt ();
        Scanner entrada6=new Scanner (System.in);
        System.out.println ("Introduce los segundos:  ");
        g = entrada6.nextInt ();
        System.out.printf("\n \n \n");

        System.out.printf("Datos introducidos: Momento incial: "+a+":"+b+":"+c+"   momento final: "+e+":"+f+":"+g+"\n");

        int h1,m1,seg1total,seg2total,segFinal;
        int h2,m2;
        int hf,minf,segf;
        h1=horaAseg(a);
        m1=minAseg(b);
        h2=horaAseg(e);
        m2=minAseg(f);
        seg1total=h1+m1+c;//la suma de los segundos de la hora inicial
        seg2total=h2+m2+g;//la suma de los segundos de la hora final
        segFinal=seg2total-seg1total;//se calcula la diferencia de horas entre uno y otro
        hf=segFinal/3600;//calculas las horas que equivale el total de sgundos de diferencia entre uno y otro
        minf=(segFinal-(3600*hf))/60;//luego los minutos
        segf=segFinal-((hf*3600)+(minf*60));// y los segundos para despues sacar el resultado final

        System.out.printf("La diferencia entre ambos momentos es de: "+hf+":"+minf+":"+segf);



    }
    public static int horaAseg(int hora)
    { int seg=0,min;
        min=hora*60;
        seg=min*60;
        return seg;
    }
    public static int minAseg(int min)
    {int seg;
        seg=min*60;
        return seg;
    }
    public static int segAhora(int seg)
    {
        return 0;
    }
}
