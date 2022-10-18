package ejerciciosCONif;

import java.util.Scanner;

public class ejercico12Fechas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Ingrese el dia: ");
        int day=sc.nextInt();
        System.out.printf("Ingrese el mes: ");
        int month=sc.nextInt();
        System.out.printf("Ingrese el año: ");
        int year=sc.nextInt();
if(year>=0)
{
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
        if(month<12 &&month>=1)
        {
            if (month==1 ||month==3 || month==5 ||month==7 ||month==8 ||month==10 ||month==12 )
            {
                if(day<=31 && day>=1)
                {
                    System.out.printf("Fecha correcta: "+day+":"+month+":"+year);
                }
                else {
                    System.out.printf("Fecha incorrecta");
                }
            }
            else if (month==4 ||month==6 ||month==9 ||month==11 )
            {
                if(day<=30 &&day>=1)
                {
                    System.out.printf("Fecha correcta: "+day+":"+month+":"+year);
                }else {
                    System.out.printf("Fecha incorrecta");
                }
            }
            else if(month==2)
            {
                if(day<=29 &&day>=01)
                {
                    System.out.printf("Fecha correcta: "+day+":"+month+":"+year);
                }else {
                    System.out.printf("Fecha incorrecta");
                }
            }
        }
    }
    else
    {
        if(month<12 &&month>=1)
        {
            if (month==1 ||month==3 || month==5 ||month==7 ||month==8 ||month==10 ||month==12 )
            {
                if(day<=31 && day>=1)
                {
                    System.out.printf("Fecha correcta: "+day+":"+month+":"+year);
                }else {
                    System.out.printf("Fecha incorrecta");
                }
            }
            else if (month==4 ||month==6 ||month==9 ||month==11 )
            {
                if(day<=30 &&day>=1)
                {
                    System.out.printf("Fecha correcta: "+day+":"+month+":"+year);
                }else {
                    System.out.printf("Fecha incorrecta");
                }
            }
            else if(month==2)
            {
                if(day<=29 &&day>=01)
                {
                    System.out.printf("Fecha correcta: "+day+":"+month+":"+year);
                }else {
                    System.out.printf("Fecha incorrecta");
                }
            }
        }
    }
}
    }
}
