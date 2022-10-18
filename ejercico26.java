import java.util.Scanner;

public class ejercico26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("parcial1: ");
        double parcial1= sc.nextDouble();
        System.out.printf("parcial2: ");
        double parcial2= sc.nextDouble();
        System.out.printf("parcial3: ");
        double parcial3= sc.nextDouble();
        System.out.printf("examenFinal: ");
        double examen= sc.nextDouble();
        System.out.printf("trabajo: ");
        double trabajo= sc.nextDouble();
       double promedioParcial=0.55;
        double promedioExa=0.30;
        double promedioTrabajo=0.15;
        double parcial=((parcial1+parcial2+parcial3)/3)*promedioParcial;
    double examenFinal=examen*promedioExa;
    double notaTrabajo=trabajo*promedioTrabajo;
    double nota=parcial+examenFinal+notaTrabajo;
        System.out.printf("la calificacion final es "+nota);

    }
}
