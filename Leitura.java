import java.util.Scanner;

public class Leitura{
    public static void main (String args[]){
Scanner teclado = new Scanner(System.in);

int valorinteiro;
double valorDouble;
float valorFloat;

System.out.println("digite um valorinteiro");
valorinteiro = teclado.nextInt();

System.out.println("Valor digitado =" +valorinteiro);
System.out.println("Agora digite um vlr Double");
valorDouble = teclado.nextDouble();

System.out.println("valor digitado = " +valorinteiro);
System.out.println("valor digitado = " +valorDouble);
    }
}