import java.util.Scanner;
/* Realiza un programa que permite introducir al usuario una hora (formato 12 o 24 horas, hora, minuto y segundo por separado) y compruebe que es
correcto cada uno de los datos que éste introduzca. En caso de fallo hará que el usuario vuelva a introducir el dato erróneo. */
public class ejercicio7 {
    public static void main(String[] args) {
       int  hora=0,min=0,seg=0;
        boolean fin=false;
        while(!fin)
        {
            Scanner entrada1=new Scanner (System.in);
            System.out.println (" \nHora: ");
            hora= entrada1.nextInt ();
            Scanner entrada2=new Scanner (System.in);
            System.out.println (" \nMinuto: ");
            min = entrada2.nextInt ();
            Scanner entrada3=new Scanner (System.in);
            System.out.println (" \nSegundos: ");
            seg = entrada3.nextInt ();

            if((hora<24)&&(min<60)&&(seg<60))
            {
                System.out.printf("La hora introducida es correcta "+hora+":"+min+":"+seg+".");
                fin=true;
            }
            else
            {
                System.out.printf("La hora introducida es incorrecta.");

            }
        }

    }


}
