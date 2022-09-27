import java.util.Scanner;
/* Realiza una aplicación que solicite por pantalla 3 números y los guarde en una cadena de texto separados por un espacio.
Por ejemplo, si el usuario introduce el 2, el 13 y el 235, el programa los almacena como “2 13 235” y lo pinta en la pantalla. */
public class ejercicio8 {
    public static void main(String[] args) {
        String a,b,c;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIntroduzca el primer numero: ");
        a= entrada1.nextLine();
        Scanner entrada2=new Scanner (System.in);
        System.out.println (" \nIntroduzca el segundo numero: ");
        b = entrada2.nextLine();
        Scanner entrada3=new Scanner (System.in);
        System.out.println (" \nIntroduzca el tercer numero: ");
        c = entrada3.nextLine();

        System.out.printf(""+a+" "+b+" "+c );
    }
}
