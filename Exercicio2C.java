import java.util.Scanner;
public class Exercicio2C{
public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);
    double altura, base, area;
    System.out.println("por favor digite o vlr da base");
    base = teclado.nextDouble();
System.out.println("por favor digite o vlr da altura");
altura = teclado.nextDouble();
    area = (base * altura)/2;
    System.out.printf ("valor da area =%.3f\n" , area);


}
}
