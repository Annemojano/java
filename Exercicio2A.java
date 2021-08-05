import java.util.Scanner;

public class Exercicio2A{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    double lado, area;

    System.out.println ("por favor, digite o vlr do lado");
    lado = teclado.nextDouble();

    area = lado*lado;

    System.out.printf("valor da area = %.3f\n", area);
    

    }
    }
