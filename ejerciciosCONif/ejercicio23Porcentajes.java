package ejerciciosCONif;

import java.util.Scanner;

public class ejercicio23Porcentajes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Introduce un numero: ");
        double a= sc.nextInt();
        System.out.printf("\n Introduce el porcentaje: ");
        double b= sc.nextDouble();
        double porcentaje=0;
        porcentaje=a*(b/100);
        a=a+porcentaje;
        System.out.printf("El numero aumentado su porcentaje es de "+a);

    }
}
