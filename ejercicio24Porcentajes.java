import java.util.Scanner;

public class ejercicio24Porcentajes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("el precio: ");
        double precio= sc.nextDouble();
        System.out.printf("la cantidad: ");
        double cantidad= sc.nextDouble();
        System.out.printf("el iva aplicado: ");
        double iva= sc.nextDouble();

        double totalsinIva=0;
        double total,ivaT;
        totalsinIva=(precio*cantidad);
        ivaT=totalsinIva*(iva/100);
        total=totalsinIva+ivaT;
        System.out.printf("El precio a pagar es de "+total);
    }
}
