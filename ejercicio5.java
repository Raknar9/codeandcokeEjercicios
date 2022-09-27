import java.util.Scanner;
/* Haz un programa que calcule el área de diferentes forma geométricas. Puedes hacer un menú donde el usuario pueda escoger entre algunas
de ellas (cuadrado, rectángulo, círculo, triángulo, . . .).
 El programa deberá pedir también las medidas necesarias y, finalmente, mostrará el área de la figura. */
public class ejercicio5 {
    public static void main(String[] args) {
    menu();
        int i=0;
        int areas=0,lado=0,base=0,altura=0;
        double decimal=0;
        double radio=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nOpcion: ");
        i = entrada1.nextInt ();
        if(i==1)
        {
            areas=cuadrado(lado);
            System.out.printf("El area del cuadrado es "+areas+".");
        }
        if(i==2)
        {
            areas=rectangulo(base,altura);
            System.out.printf("El area del rectangulo es "+areas+".");
        }
        if(i==3)
        {
            decimal = circulo (radio);
            System.out.printf("El area del circulo es "+decimal);
        }
        if(i==4)
        {
            areas=triangulo(base,altura);
            System.out.printf("El area del triangulo es "+areas);
        }



    }
    public static void menu()
    {
        System.out.printf("Elije la figura que quieres calcular el area: \n");
        System.out.printf("1-Cuadrado\n");
        System.out.printf("2-Rectangulo\n");
        System.out.printf("3-Circulo\n");
        System.out.printf("4-triangulo\n");
        /*El área de un cuadrado es igual al cuadrado de la longitud del lado.
        El área de un rectángulo es el producto de la longitud de los lados es decir base por altura.
        el area del circulo es pi por radio al cuadrado
            el area del triangulo es la base por altura sobre 2*/
    }

    public static int cuadrado(int lado)
    {   int a=0;
        int area=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca el lado del cuadrado: ");
        a = entrada1.nextInt ();
        area=a*a;

        return area;
    }
    public static int rectangulo(int base,int altura)
    {   int a=0,b=0;
        int area=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca la base del rectangulo: ");
        b = entrada1.nextInt ();

        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nIntroduzca la altura del rectangulo: ");
        a = entrada2.nextInt ();
        area=b*a;

        return area;

    }
    public static double circulo(double radio)
    {   double r=0;
        double area=0;

        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca la radio del circulo: ");
        r = entrada1.nextDouble ();


        area=3.14*(r*r);

        return area;

    }
    public static int triangulo(int base,int altura)
    {   int a=0,b=0;
        int area=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca la base del triangulo: ");
        b = entrada1.nextInt ();

        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nIntroduzca la altura del triangulo: ");
        a = entrada2.nextInt ();
        area=(b*a)/2;

        return area;

    }
}
