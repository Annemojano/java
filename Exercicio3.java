import java.util.Scanner;
public class Exercicio3{
public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);
    double vlrsalariominimo, qtdekw, vlrkw, vlrtotal, vlrdesconto;
    System.out.println("por favor digite o vlr do salario minimo");
    vlrsalariominimo = teclado.nextDouble();
System.out.println("por favor digite a qtde do kw");
qtdekw = teclado.nextDouble();
vlrkw = vlrsalariominimo /700;
vlrtotal = qtdekw * vlrkw;
vlrdesconto = vlrtotal *0.9;



    
    System.out.printf ("vlr do Kw %.2f\n" , vlrkw);
    System.out.printf ("vlr total %.2f\n" , vlrtotal);
System.out.printf ("vlr desconto de 10%% R$ %.2f\n" , vlrdesconto);


}
}
