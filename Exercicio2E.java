import java.util.Scanner;
public class Exercicio2E{
public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);
    double altura, basemaior , basemenor,  area;
    System.out.println("por favor digite o vlr da base maior");
    basemaior = teclado.nextDouble();
System.out.println("por favor digite o vlr da base menor");
    basemenor = teclado.nextDouble();


System.out.println("por favor digite o vlr da altura");
altura = teclado.nextDouble();
    area = (basemaior + basemenor)* altura/2;
    System.out.printf ("valor da area =%.3f\n" , area);


}
}
